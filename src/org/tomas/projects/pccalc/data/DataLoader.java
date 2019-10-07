package org.tomas.projects.pccalc.data;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.MotherBoard;
import org.tomas.projects.pccalc.model.RAM;
import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public class DataLoader {

	public PCComponentsData loadData() {

		List<MotherBoard> mblist = new ArrayList<>();

		List<CPU> cpulist = new ArrayList<>();
		cpulist.add(new CPU("intel", PriceLevel.Budget, 550, CPUSocket.Socket1));
		cpulist.add(new CPU("111", PriceLevel.Budget, 850, CPUSocket.Socket1));
		cpulist.add(new CPU("22", PriceLevel.Budget, 650, CPUSocket.Socket1));
		cpulist.add(new CPU("33", PriceLevel.Budget, 600, CPUSocket.Socket1));

		List<RAM> ramlist = new ArrayList<>();
		// TODO duomenys cia
		return new PCComponentsData();

	}

}
