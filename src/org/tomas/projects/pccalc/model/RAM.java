package org.tomas.projects.pccalc.model;

import org.tomas.projects.pccalc.model.enums.RAMType;

public class RAM extends AbstractPCComponent {

	private RAMType type;

	public RAMType getType() {
		return type;
	}

	public void setType(RAMType type) {
		this.type = type;
	}

	
}
