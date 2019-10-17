package org.tomas.projects.pcsearch.model.filter;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.MotherBoard;
import org.tomas.projects.pccalc.model.PC;
import org.tomas.projects.pccalc.model.enums.CPUSocket;

public class FilterByCompatibility extends FilterByCriteriaUni<Boolean> {

	@Override
	protected Boolean beforeCheck(Boolean searchCriteria) {
		return searchCriteria;
	}

	@Override
	protected boolean isCriteriaValid(Boolean searchCriteria) {
		return searchCriteria != null;
	}

	@Override
	protected boolean pcComponentFilter(AbstractPCComponent pc, Boolean searchCriteria) {
		return false;
	}

	@Override
	protected boolean pcFilter(PC pc, Boolean searchCriteria) {

		// t t -> t
		// f t -> f
		// t f -> f
		// f f -> t

		return !(isValidPC(pc) ^ searchCriteria);
	}

	private boolean isValidPC(PC pc) {

		List<CPU> cpu = new ArrayList<>();
		List<MotherBoard> mb = new ArrayList<>();

		for (AbstractPCComponent ac : pc.getComponents()) {
			if (ac instanceof CPU) {
				cpu.add((CPU) ac);
			}
			if (ac instanceof MotherBoard) {
				mb.add((MotherBoard) ac);
			}
		}

		if (mb.size() > 1) {
			return false;
		}
		if (cpu.isEmpty()) {
			return true;
		}

		if (cpu.size() > 1) {
			CPUSocket socket = null;
			if (mb.size() == 1) {
				socket = mb.get(0).getSocket();
			} else {
				socket = cpu.get(0).getSocket();
			}

			for (CPU c : cpu) {
				if (!socket.equals(c.getSocket())) {
					return false;
				}
			}
		}

		return true;
	}

}
