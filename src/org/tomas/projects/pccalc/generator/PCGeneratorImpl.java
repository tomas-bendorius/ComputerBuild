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
import org.tomas.projects.pccalc.model.enums.CPUSocket;
import org.tomas.projects.pccalc.model.enums.PriceLevel;

public class PCGeneratorImpl implements PCGenerator {

	private static final int MAX_GENCOUNT = 20;

	@Override
	public GeneratorResult generateOptions(PCComponentsData data, PriceLevel level, CPUSocket socket) {

		List<AbstractPCComponent> comp = data.getComponent();

		comp = filterByPriceLevel(level, comp);
		comp = filterOnlyBase(comp);

		Map<String, List<AbstractPCComponent>> baseByType = filterBaseByType(comp);

		long limit = generatedCount(baseByType);
		if (limit > MAX_GENCOUNT) {
			return new GeneratorResult( MAX_GENCOUNT, limit, true);
		}
		
		return new GeneratorResult(generate(baseByType), MAX_GENCOUNT, limit, false);
	}

	private List<PC> generate(Map<String, List<AbstractPCComponent>> baseByType) {
		
		
		
		
		
		return null;
	}

	private long generatedCount(Map<String, List<AbstractPCComponent>> baseByType) {

		Collection<List<AbstractPCComponent>> componentCountList = baseByType.values();

		long countresult = 1;
		for (List<AbstractPCComponent> list : componentCountList) {
			countresult = countresult * list.size();
		}

		return countresult;
	}

	private Map<String, List<AbstractPCComponent>> filterBaseByType(List<AbstractPCComponent> comp) {

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

	private List<AbstractPCComponent> filterOnlyBase(List<AbstractPCComponent> comp) {
		List<AbstractPCComponent> result = new ArrayList<>();
		for (AbstractPCComponent c : comp) {
			if (c.isBasic()) {
				result.add(c);
			}
		}

		return result;
	}

	private List<AbstractPCComponent> filterByPriceLevel(PriceLevel level, List<AbstractPCComponent> comp) {
		List<AbstractPCComponent> priceLevelComp = new ArrayList<>();
		for (AbstractPCComponent c : comp) {
			if (c.getPriceLevel().equals(level)) {
				priceLevelComp.add(c);
			}
		}

		return priceLevelComp;
	}

}
