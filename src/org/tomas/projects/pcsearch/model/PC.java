package org.tomas.projects.pcsearch.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PC {

	private List<AbstractPCComponent> components = new ArrayList<>();

	public PC(AbstractPCComponent... components) {
		this.components.addAll(Arrays.asList(components));
	}

	public PC(List<AbstractPCComponent> components) {
		this.components.addAll(components);
	}

	public List<AbstractPCComponent> getComponents() {
		return components;
	}

	public void addComponent(AbstractPCComponent c) {
		components.add(c);
	}

	@Override
	public String toString() {
		return "PC [components=" + components + "]";
	}

}
