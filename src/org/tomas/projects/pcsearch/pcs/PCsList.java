package org.tomas.projects.pcsearch.pcs;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.MotherBoard;
import org.tomas.projects.pccalc.model.RAM;
import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;
import org.tomas.projects.pccalc.model.enums.RAMType;

public class PCsList {

	{

		List<MotherBoard> mblist = new ArrayList<>();
		mblist.add(new MotherBoard("gigabyte", PriceLevel.Budget, 99.99, CPUSocket.Socket2, RAMType.DDR3));
		mblist.add(new MotherBoard("asus    ", PriceLevel.Budget, 99.99, CPUSocket.Socket1, RAMType.DDR4));

		List<CPU> cpulist = new ArrayList<>();
		cpulist.add(new CPU("i3    ", PriceLevel.Budget, 550, CPUSocket.Socket1));
		cpulist.add(new CPU("i5    ", PriceLevel.Budget, 950, CPUSocket.Socket1));
		cpulist.add(new CPU("Ryzen2", PriceLevel.Budget, 1200, CPUSocket.Socket2));
		cpulist.add(new CPU("Ryzen1", PriceLevel.Budget, 1400, CPUSocket.Socket2));

		List<RAM> ramlist = new ArrayList<>();
		ramlist.add(new RAM("lenovo  ", PriceLevel.Budget, 350, RAMType.DDR4));
		ramlist.add(new RAM("kingston", PriceLevel.Budget, 50, RAMType.DDR2));
		ramlist.add(new RAM("hp      ", PriceLevel.Budget, 150, RAMType.DDR3));
		ramlist.add(new RAM("dell    ", PriceLevel.Budget, 200, RAMType.DDR2));

		List<AbstractPCComponent> kita = new ArrayList<>();
		kita.add(new AbstractPCComponent() {
			public boolean isBasic() {
				return false;
			}

			public String getName() {
				return "Ausines";
			}

			public PriceLevel getPriceLevel() {
				return PriceLevel.Budget;
			}

			public double getPrice() {
				return 9.99;
			}

		});

	}

}
