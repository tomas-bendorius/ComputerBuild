package org.tomas.projects.pccalc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PC {

	private List<AbstractPCComponent>components = new ArrayList<>();

	public PC(AbstractPCComponent ... components) {

		this.components = Arrays.asList(components);
	}

	public List<AbstractPCComponent> getComponents() {
		return components;
	}
	
	
	
	
	//TODO to string
}
