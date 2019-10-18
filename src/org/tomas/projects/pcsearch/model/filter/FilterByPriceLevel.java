package org.tomas.projects.pcsearch.model.filter;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.Disk;
import org.tomas.projects.pccalc.model.MotherBoard;
import org.tomas.projects.pccalc.model.PC;
import org.tomas.projects.pccalc.model.RAM;

public class FilterByPriceLevel extends FilterByCriteriaUni<Boolean> {

	@Override
	protected boolean pcFilter(PC pc, Boolean searchCriteria) {
		return searchCriteria;
	}

	@Override
	protected Boolean beforeCheck(Boolean searchCriteria) {
		return searchCriteria != null;
	}

	@Override
	protected boolean isCriteriaValid(Boolean searchCriteria) {
		return false;
	}

	@Override
	protected boolean pcComponentFilter(AbstractPCComponent pc, Boolean searchCriteria) {
		return false;
	}

//	@Override
//	protected boolean pcPriceLevelFilter(AbstractPCComponent pc, Boolean searchCriteria) {
//		pc.getPriceLevel().Economic;
//		return true;
//	}

	@Override
	protected boolean pcPriceLevelFilter(PC pc, Boolean searchCriteria) {

		List<CPU> cpu = new ArrayList<>();
		List<MotherBoard> mb = new ArrayList<>();
		List<RAM> ram = new ArrayList<>();
		List<Disk> disk = new ArrayList<>();

		for (AbstractPCComponent ac : pc.getComponents()) {

			if {
				
				
			}
			
		}
		return searchCriteria;

	}

}
