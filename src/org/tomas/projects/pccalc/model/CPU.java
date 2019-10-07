package org.tomas.projects.pccalc.model;

import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public class CPU extends AbstractPCComponent {

	private CPUSocket socket;

	public CPU(String name, PriceLevel priceLevel, double price, CPUSocket socket) {
		super();
		setName(name);
		setPriceLevel(priceLevel);
		setPrice(price);
		this.socket = socket;
	}

	public CPUSocket getSocket() {
		return socket;
	}

	public void setSocket(CPUSocket socket) {
		this.socket = socket;
	}

}
