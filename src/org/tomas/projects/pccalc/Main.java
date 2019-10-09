package org.tomas.projects.pccalc;

import java.util.List;

import org.tomas.projects.pccalc.data.DataLoader;
import org.tomas.projects.pccalc.data.PCComponentsData;
import org.tomas.projects.pccalc.generator.PCGenerator;
import org.tomas.projects.pccalc.generator.PCGeneratorImpl;
import org.tomas.projects.pccalc.model.PC;
import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public class Main {

	public static void main(String[] args) {
		
		DataLoader dataLoader = new DataLoader();
		
		PCComponentsData data = dataLoader.loadData();
		
		PCGenerator generator = new PCGeneratorImpl();
		
		List<PC>result = generator.generateOptions(data, PriceLevel.Budget, CPUSocket.Socket1);
		
		for (PC pc : result) {
			System.out.println(pc);
		}
		
	}
}
