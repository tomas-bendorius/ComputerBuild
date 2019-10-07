package org.tomas.projects.pccalc.model;

import org.tomas.projects.pccalc.model.enums.PriceLevel;

public abstract class AbstractPCComponent {

	private String name;

	private PriceLevel priceLevel;

	private double price;
	
	private boolean basic;

	

	public boolean isBasic() {
		return basic;
	}

	public void setBasic(boolean basic) {
		this.basic = basic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PriceLevel getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(PriceLevel priceLevel) {
		this.priceLevel = priceLevel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
