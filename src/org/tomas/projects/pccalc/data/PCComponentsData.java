package org.tomas.projects.pccalc.data;

import java.util.ArrayList;
import java.util.List;

import org.tomas.projects.pccalc.model.CPU;
import org.tomas.projects.pccalc.model.MotherBoard;

public class PCComponentsData {

	private List<MotherBoard> mblist = new ArrayList<>();

	private List<CPU> cpulist = new ArrayList<>();

	public PCComponentsData(List<MotherBoard> mblist, List<CPU> cpulist) {
		super();
		this.mblist = mblist;
		this.cpulist = cpulist;
	}

	public PCComponentsData() {

	}

	public List<MotherBoard> getMblist() {
		return mblist;
	}

	public List<CPU> getCpulist() {
		return cpulist;
	}

}
