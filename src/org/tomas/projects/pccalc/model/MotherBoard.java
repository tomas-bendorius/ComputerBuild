package org.tomas.projects.pccalc.model;

import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;
import org.tomas.projects.pccalc.model.enums.RAMType;

public class MotherBoard extends AbstractPCComponent {

	private CPUSocket socket;

	private RAMType ramType;

	public MotherBoard(String name, PriceLevel priceLevel, double price, CPUSocket socket, RAMType ramType) {
		super();
		this.socket = socket;
		this.ramType = ramType;
		this.name = name;
		this.priceLevel = priceLevel;
		this.price = price;

	}

	public CPUSocket getSocket() {
		return socket;
	}

	public void setSocket(CPUSocket socket) {
		this.socket = socket;
	}

	public RAMType getRamType() {
		return ramType;
	}

	public void setRamType(RAMType ramType) {
		this.ramType = ramType;
	}

	@Override
	public boolean isBasic() {
		return true;
	}

}
