package org.tomas.projects.pccalc.generator;

import java.util.List;

import org.tomas.projects.pccalc.data.PCComponentsData;
import org.tomas.projects.pccalc.model.GeneratorResult;
import org.tomas.projects.pccalc.model.PC;
import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public interface PCGenerator {

	GeneratorResult generateOptions(PCComponentsData data, PriceLevel level, CPUSocket socket);

	
	
	
}
