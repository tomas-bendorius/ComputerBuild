package org.tomas.projects.pcsearch.model.filter;

import org.tomas.projects.pcsearch.model.AbstractPCComponent;
import org.tomas.projects.pcsearch.model.Disk;
import org.tomas.projects.pcsearch.model.PC;

public class FilterByHDD extends FilterByCriteriaUni<Boolean> {
	
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
		if(pc instanceof Disk) {
		return true;
		
	}
	return false;
	}

	@Override
	protected boolean pcFilter(PC pc, Boolean searchCriteria) {

		return false;
	}

}
