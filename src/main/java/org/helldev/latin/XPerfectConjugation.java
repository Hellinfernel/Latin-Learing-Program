package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class XPerfectConjugation extends PerfectForm {
    public XPerfectConjugation(String stem) {
        super(stem, "xisse");
    }

    @Override
    public Map<VerbProperties, String> getSuffixes() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.SINGULAR,Tempus.PERFECT), "xi");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.SINGULAR,Tempus.PERFECT), "xisti");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.SINGULAR,Tempus.PERFECT), "xit");
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.PLURAL,Tempus.PERFECT), "ximus");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.PLURAL,Tempus.PERFECT), "xistis");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.PLURAL,Tempus.PERFECT), "xerunt");
        return suffixes;
    }
}
