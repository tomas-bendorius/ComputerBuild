package org.tomas.projects.pccalc.model;

import org.tomas.projects.pccalc.model.enums.PriceLevel;

public abstract class AbstractPCComponent {

	protected String name;

	protected PriceLevel priceLevel;

	protected double price;
	
	protected double powerConsumption;

	public abstract boolean isBasic();

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
	

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + "]";
	}

}
