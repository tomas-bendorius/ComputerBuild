package org.tomas.projects.pccalc.model;

import org.tomas.projects.pccalc.model.enums.DiskSize;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public class Disk extends AbstractPCComponent {

	private DiskSize size;

	public Disk(String name, PriceLevel pricelevel, double price, DiskSize size) {

		super();
		setName(name);
		setPriceLevel(priceLevel);
		setPrice(price);
		this.size = size;

	}

	public DiskSize getSize() {
		return size;
	}

	public void setSize(DiskSize size) {
		this.size = size;
	}

	@Override
	public boolean isBasic() {

		return true;
	}

}
