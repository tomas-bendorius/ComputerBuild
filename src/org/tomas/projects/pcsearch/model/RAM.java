package org.tomas.projects.pcsearch.model;

import org.tomas.projects.pcsearch.model.enums.PriceLevel;
import org.tomas.projects.pcsearch.model.enums.RAMType;

public class RAM extends AbstractPCComponent {

	private RAMType type;

	public RAM(String name, PriceLevel priceLevel, double price, RAMType type) {
		super();
		setName(name);
		setPriceLevel(priceLevel);
		setPrice(price);
		this.type = type;

	}

	public RAMType getType() {
		return type;
	}

	public void setType(RAMType type) {
		this.type = type;
	}

	@Override
	public boolean isBasic() {
		return true;
	}
}
