package org.tomas.projects.pcsearch.model.filter;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.Disk;
import org.tomas.projects.pccalc.model.PC;

public class FilterByHDD extends FilterByCriteriaUni<Boolean> {

	private boolean diskFlag = false;
	
	@Override
	protected Boolean beforeCheck(Boolean searchCriteria) {
		return searchCriteria;
	}

	@Override
	public boolean isCriteriaValid(Boolean searchCriteria) {
		return searchCriteria != null;
	}

	@Override
	public boolean pcComponentFilter(AbstractPCComponent pc, Boolean searchCriteria) {

		diskFlag = diskFlag || (pc instanceof Disk);
		return false;
	}

	@Override
	protected boolean pcFilter(PC pc, Boolean searchCriteria) {

		//if (searchCriteria) {
		
		boolean result = diskFlag;
		diskFlag = false;
		
			return result;
		//}
		
		
		//return !diskFlag;
	}

	@Override
	protected boolean pcPriceLevelFilter(PC pc, Boolean searchCriteria) {
		// TODO Auto-generated method stub
		return false;
	}


}
