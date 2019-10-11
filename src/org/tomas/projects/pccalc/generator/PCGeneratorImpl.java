package org.tomas.projects.pccalc.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tomas.projects.pccalc.data.PCComponentsData;
import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.GeneratorResult;
import org.tomas.projects.pccalc.model.PC;

public class PCGeneratorImpl {

	private static final int MAX_GENCOUNT = 1000000;


	public GeneratorResult generateOptions(PCComponentsData data, GeneratorFilter handler) {

		List<AbstractPCComponent> comp = data.getComponent();
		Map<String, List<AbstractPCComponent>> mapByType = mapByType( componentsFilterBefore(handler, comp));

		long limit = generatedCount(mapByType);
		if (limit > MAX_GENCOUNT) {
			return new GeneratorResult(MAX_GENCOUNT, limit, true);
		}

		List<PC> pcs = generate(mapByType, handler);
		List<PC> pcsFilterAfter = pcsFilterAfter(handler, pcs);

		return new GeneratorResult(pcsFilterAfter, MAX_GENCOUNT, limit, false);
	}

	private List<PC> pcsFilterAfter(GeneratorFilter handler, List<PC> pcs) {
		List<PC> pcsFilterAfter = new ArrayList<>();
		for (PC pc : pcs) {
			if (handler.filterAfter(pc)) {
				pcsFilterAfter.add(pc);
			}
		}
		return pcsFilterAfter;
	}

	private List<AbstractPCComponent> componentsFilterBefore(GeneratorFilter handler, List<AbstractPCComponent> comp) {
		List<AbstractPCComponent> compFilterBefore = new ArrayList<>();

		for (AbstractPCComponent abstractPCComponent : comp) {
			if (handler.filterBefore(abstractPCComponent)) {
				compFilterBefore.add(abstractPCComponent);
			}
		}
		return compFilterBefore;
	}

	private List<PC> generate(Map<String, List<AbstractPCComponent>> baseByType,GeneratorFilter handler) {

		List<PC> pcs = new ArrayList<>();
		List<PC> pcExts = new ArrayList<>();
		List<AbstractPCComponent> list = baseByType.remove(baseByType.keySet().iterator().next());

		for (AbstractPCComponent l : list) {
			pcs.add(new PC(l));
		}

		for (String key : baseByType.keySet()) { // Map by components
			pcExts = new ArrayList<>();

			for (AbstractPCComponent l : baseByType.get(key)) { // Components

				// filters here

				// add copy with another combination
				pcExts.addAll(createCombinationWithAnotherComponent(pcs, l, handler));
			}

			pcs = pcExts;
		}
		return pcs;
	}

	private List<PC> createCombinationWithAnotherComponent(List<PC> pcsOrig, AbstractPCComponent l, GeneratorFilter handler) {

		List<PC> pcsNewComb = new ArrayList<>();

		// copy
		for (PC pc : pcsOrig) {
			pcsNewComb.add(new PC(pc.getComponents()));
		}

		// add component
		List<PC> incompatibleCombinations = new ArrayList<>();
		for (PC pc : pcsNewComb) {
			pc.addComponent(l);
			
			if(!handler.componentsCompatible(pc)) {
				incompatibleCombinations.add(pc);
			}
		}
		pcsNewComb.removeAll(incompatibleCombinations);
		

		return pcsNewComb;
	}

	private long generatedCount(Map<String, List<AbstractPCComponent>> baseByType) {

		Collection<List<AbstractPCComponent>> componentCountList = baseByType.values();

		long countresult = 1;
		for (List<AbstractPCComponent> list : componentCountList) {
			countresult = countresult * list.size();
		}

		return countresult;
	}

	private Map<String, List<AbstractPCComponent>> mapByType(List<AbstractPCComponent> comp) {

		Map<String, List<AbstractPCComponent>> result = new HashMap<>();

		String key = null;

		for (AbstractPCComponent c : comp) {
			key = c.getClass().getSimpleName();

			if (!result.containsKey(key)) {
				result.put(key, new ArrayList<AbstractPCComponent>());
			}

			result.get(key).add(c);

		}

		return result;
	}

	

}
