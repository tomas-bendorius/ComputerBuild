package org.tomas.projects.pcsearch.search;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pcsearch.model.CPU;
import org.tomas.projects.pcsearch.model.Disk;
import org.tomas.projects.pcsearch.model.MotherBoard;
import org.tomas.projects.pcsearch.model.PC;
import org.tomas.projects.pcsearch.model.RAM;
import org.tomas.projects.pcsearch.model.enums.CPUSocket;
import org.tomas.projects.pcsearch.model.enums.DiskSize;
import org.tomas.projects.pcsearch.model.enums.PriceLevel;
import org.tomas.projects.pcsearch.model.enums.RAMType;
import org.tomas.projects.pcsearch.model.filter.FilterByCompatibility;


public class Main {

	public static void main(String[] args) {
		
		
		List<PC> computers = new ArrayList<PC>();
		
		computers.add(new PC
				(
						new MotherBoard("dell", PriceLevel.Economic, 45.99, CPUSocket.Socket1, RAMType.DDR4),
						new CPU("dell", PriceLevel.Midrange, 99.99, CPUSocket.Socket1),
						new RAM("4GB", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3),
						new RAM("4GB dell", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3),
						new Disk("dell", PriceLevel.Highlevel, 59.99, DiskSize.GB128)
				));
		
		computers.add(new PC
				(
						new RAM("qwerty", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3),
						new Disk("dell", PriceLevel.Highlevel, 59.99, DiskSize.GB128)
				));
		computers.add(new PC
				(
						new MotherBoard("ojjkjk", PriceLevel.Economic, 45.99, CPUSocket.Socket1, RAMType.DDR4),
						new CPU("dell", PriceLevel.Midrange, 99.99, CPUSocket.Socket2),
						new RAM("fbsfbdsb", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3)
				));
		computers.add(new PC
				(

						new CPU("Socket2", PriceLevel.Midrange, 99.99, CPUSocket.Socket2),
						new RAM("Socket2", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3)
				));
		computers.add(new PC
				(
						new MotherBoard("dell", PriceLevel.Economic, 45.99, CPUSocket.Socket2, RAMType.DDR4),
						new CPU("dell", PriceLevel.Midrange, 99.99, CPUSocket.Socket1),
						new RAM("4GB", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3),
						new RAM("4GB dell", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3),
						new Disk("dell", PriceLevel.Highlevel, 59.99, DiskSize.GB128)
				));
		
		
		
		
//		System.out.println(computers);
		
		for (PC pc : computers) {
			System.out.println(pc);
		}

		System.out.println();

		FilterByCompatibility filtras = new FilterByCompatibility();
		List<PC> result = filtras.searchByCriteria(computers, false);

		for (PC pc : result) {
			System.out.println(pc);
		}
		
		
		
		
//		System.out.println();
//		result = filtras.searchBySocket(computers, CPUSocket.Socket2);
//
//		for (PC pc : result) {
//			System.out.println(pc);
//		}
//		
		
		
		

//		PC computer = new PC
//				(
//						new MotherBoard("motinine", PriceLevel.Economic, 45.99, CPUSocket.Socket1, RAMType.DDR4),
//						new CPU("dell", PriceLevel.Midrange, 99.99, CPUSocket.Socket2),
//						new RAM("4GB", PriceLevel.Extremeperformace, 199.99, RAMType.DDR3)
//				);
//
//		for (AbstractPCComponent component : computer.getComponents()) {
//			System.out.println(component);
//		}
//		
//		System.out.println(computer);

	}

}
