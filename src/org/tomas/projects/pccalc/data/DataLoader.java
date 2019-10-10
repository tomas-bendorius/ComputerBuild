 package org.tomas.projects.pccalc.data;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.MotherBoard;
import org.tomas.projects.pccalc.model.RAM;
import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;
import org.tomas.projects.pccalc.model.enums.RAMType;

public class DataLoader {

	public PCComponentsData loadData() {

		List<MotherBoard> mblist = new ArrayList<>();
		mblist.add(new MotherBoard("gigabyte", PriceLevel.Budget, 99.99, true, CPUSocket.Socket1, RAMType.DDR3));

		List<CPU> cpulist = new ArrayList<>();
		cpulist.add(new CPU("intel", PriceLevel.Budget, 550, CPUSocket.Socket1));
		cpulist.add(new CPU("asus", PriceLevel.Economic, 950, CPUSocket.Socket2));
		cpulist.add(new CPU("amd", PriceLevel.Midrange, 1200, CPUSocket.Socket1));
		cpulist.add(new CPU("intel", PriceLevel.Highlevel, 1400, CPUSocket.Socket2));

		List<RAM> ramlist = new ArrayList<>();
		ramlist.add(new RAM("lenovo", PriceLevel.Extremeperformace, 350, RAMType.DDR4));
		ramlist.add(new RAM("kingston", PriceLevel.Economic, 50, RAMType.DDR2));
		ramlist.add(new RAM("hp", PriceLevel.Midrange, 150, RAMType.DDR3));
		ramlist.add(new RAM("dell", PriceLevel.Highlevel, 200, RAMType.DDR2));

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
				return 19.99;
			}

		});

		return new PCComponentsData(mblist, cpulist, ramlist, kita);

	}

}
