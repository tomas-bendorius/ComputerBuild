package org.tomas.projects.pccalc.generator;

import org.tomas.projects.pccalc.data.PCComponentsData;
import org.tomas.projects.pccalc.model.GeneratorResult;

public interface PCGenerator {

	GeneratorResult generateOptions(PCComponentsData data, GeneratorFilter handler);

}
