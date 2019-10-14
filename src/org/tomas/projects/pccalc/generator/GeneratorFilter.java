package org.tomas.projects.pccalc.generator;

import org.tomas.projects.pccalc.model.AbstractPCComponent;
import org.tomas.projects.pccalc.model.PC;

public interface GeneratorFilter {

	boolean filterBefore(AbstractPCComponent abstractPCComponent);

	boolean filterAfter(PC pc);

	boolean componentsCompatible(PC pc);

}
