package org.tomas.projects.pccalc.model;

import java.util.List;

public class GeneratorResult {

	private List<PC> pcs;
	private long maxcount;
	private long count;
	private boolean limitexceded;
	
	

	public GeneratorResult(List<PC> pcs, long maxcount, long count, boolean limitexceded) {
		super();
		this.pcs = pcs;
		this.maxcount = maxcount;
		this.count = count;
		this.limitexceded = limitexceded;
	}

	public GeneratorResult(long maxcount, long count, boolean limitexceded) {
		this.maxcount = maxcount;
		this.count = count;
		this.limitexceded = limitexceded;
	}

	public List<PC> getPcs() {
		return pcs;
	}

	public void setPcs(List<PC> pcs) {
		this.pcs = pcs;
	}

	public long getMaxcount() {
		return maxcount;
	}

	public void setMaxcount(long maxcount) {
		this.maxcount = maxcount;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public boolean isLimitexceded() {
		return limitexceded;
	}

	public void setLimitexceded(boolean limitexceded) {
		this.limitexceded = limitexceded;
	}

}
