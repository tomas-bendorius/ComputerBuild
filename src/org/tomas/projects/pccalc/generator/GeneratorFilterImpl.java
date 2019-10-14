package org.tomas.projects.pccalc.generator;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.MotherBoard;
import org.tomas.projects.pccalc.model.PC;
import org.tomas.projects.pccalc.model.RAM;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public class GeneratorFilterImpl implements GeneratorFilter {

	private PriceLevel level;

	public GeneratorFilterImpl(PriceLevel level) {
		super();
		this.level = level;
	}

	@Override
	public boolean filterBefore(AbstractPCComponent abstractPCComponent) {
		return abstractPCComponent.isBasic() && level.equals(abstractPCComponent.getPriceLevel());
	}

	@Override
	public boolean filterAfter(PC pc) {

		return true;
	}

	@Override
	public boolean componentsCompatible(PC pc) {

		// pc.getComponents()

		MotherBoard mb = null;
		CPU cpu = null;
		RAM ram = null;

		for (AbstractPCComponent pcc : pc.getComponents()) {
			if (pcc instanceof MotherBoard) {
				mb = (MotherBoard) pcc;
			} else if (pcc instanceof CPU) {
				cpu = (CPU) pcc;
			} else if (pcc instanceof RAM) {
				ram = (RAM) pcc;
			}
		}

		if (mb != null) {
			if (cpu != null) {
				if (!mb.getSocket().equals(cpu.getSocket())) {
					return false;
				}
			}

			if (ram != null) {
				if (!mb.getRamType().equals(ram.getType())) {
					return false;
				}
			}
		}

		return true;
	}

}
