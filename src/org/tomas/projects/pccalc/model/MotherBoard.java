package org.tomas.projects.pccalc.model;

import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.RAMType;

public class MotherBoard extends AbstractPCComponent {

	private CPUSocket socket;

	private RAMType ramType;

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
	
	
}
