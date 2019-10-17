package org.tomas.projects.pcsearch.model.filter;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.PC;

public abstract class FilterByCriteriaUni<SEARCHTYPE> {

	public List<PC> searchByCriteria(List<PC> allpcs, SEARCHTYPE searchCriteria) {

		searchCriteria = beforeCheck(searchCriteria);
		
		List<PC> result = new ArrayList<>();
		if (!isCriteriaValid(searchCriteria) ) {
			return result;
		}

		boolean doItFit = false;
		for (PC pc : allpcs) {
			
			// separete components check
			for (AbstractPCComponent ac : pc.getComponents()) {
				if (pcComponentFilter(ac, searchCriteria)) {
					doItFit = true;
				}
			}
			
			// whole pc check
			if (pcFilter(pc, searchCriteria)) {
				doItFit = true;
			}
			
			// if ok... add to search result
			if (doItFit) {
				result.add(pc);
			}
			
		}
		return result;
	}

	protected abstract boolean pcFilter(PC pc, SEARCHTYPE searchCriteria);

	protected abstract SEARCHTYPE beforeCheck(SEARCHTYPE searchCriteria);

	protected abstract boolean isCriteriaValid(SEARCHTYPE searchCriteria);

	protected abstract boolean pcComponentFilter(AbstractPCComponent pc, SEARCHTYPE searchCriteria);
	
	
}
