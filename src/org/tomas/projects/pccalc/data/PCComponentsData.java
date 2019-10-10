package org.tomas.projects.pccalc.data;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.MotherBoard;
import org.tomas.projects.pccalc.model.RAM;

public class PCComponentsData {

	private List<AbstractPCComponent> component = new ArrayList<>();

	public PCComponentsData(List<? extends AbstractPCComponent>... component) {
		super();
		for (List<? extends AbstractPCComponent> list : component) {
			this.component.addAll(list);
		}
	}

	public List<AbstractPCComponent> getComponent() {
		return component;
	}

}
