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

		for (PC pc : allpcs) {
			for (AbstractPCComponent ac : pc.getComponents()) {
				if (pcComponentFilter(ac, searchCriteria)) {
					result.add(pc);
					break;
				}
			}
			if (pcFilter(pc, searchCriteria)) {
				result.add(pc);
				break;
			}
		}
		return result;
	}

	protected abstract boolean pcFilter(PC pc, SEARCHTYPE searchCriteria);

	protected abstract SEARCHTYPE beforeCheck(SEARCHTYPE searchCriteria);

	protected abstract boolean isCriteriaValid(SEARCHTYPE searchCriteria);

	protected abstract boolean pcComponentFilter(AbstractPCComponent pc, SEARCHTYPE searchCriteria);
	
	
}
