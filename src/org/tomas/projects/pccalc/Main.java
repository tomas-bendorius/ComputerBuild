package org.tomas.projects.pccalc;

import org.tomas.projects.pccalc.data.DataLoader;
import org.tomas.projects.pccalc.data.PCComponentsData;
import org.tomas.projects.pccalc.generator.GeneratorFilter;
import org.tomas.projects.pccalc.generator.GeneratorFilterImpl;
import org.tomas.projects.pccalc.generator.PCGeneratorImpl;
import org.tomas.projects.pccalc.model.GeneratorResult;
import org.tomas.projects.pccalc.model.PC;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public class Main {

	public static void main(String[] args) {

		DataLoader dataLoader = new DataLoader();

		PCComponentsData data = dataLoader.loadData();

		PCGeneratorImpl generator = new PCGeneratorImpl();
		
		GeneratorFilter filter = new GeneratorFilterImpl(PriceLevel.Budget);

		GeneratorResult result = generator.generateOptions(data, filter);

		for (PC pc : result.getPcs()) {
			System.out.println(pc);
		}

	}
}
