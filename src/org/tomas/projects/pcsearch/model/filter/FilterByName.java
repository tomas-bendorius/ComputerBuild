package org.tomas.projects.pcsearch.model.filter;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.PC;

public class FilterByName extends FilterByCriteriaUni<String> {
	
	@Override
	protected String beforeCheck(String searchCriteria) {
		return searchCriteria.trim();
	}

	@Override
	public boolean isCriteriaValid(String searchCriteria) {
		return !searchCriteria.isBlank();
	}

	@Override
	public boolean pcComponentFilter(AbstractPCComponent pc, String searchCriteria) {
		return pc.getName().toLowerCase().contains(searchCriteria.toLowerCase());
	}

	@Override
	protected boolean pcFilter(PC pc, String searchCriteria) {
		return false;
	}

	@Override
	protected boolean pcPriceLevelFilter(PC pc, String searchCriteria) {
		// TODO Auto-generated method stub
		return false;
	}

}
