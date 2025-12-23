package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class ForthConjugation extends Verb{
    public ForthConjugation(String stem) {
        super(stem, getBaseMap(), "ire");
    }
    private static Map<VerbProperties, String> getBaseMap() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR), "io");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR), "is");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR), "it");
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL), "imus");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL), "itis");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL), "iunt");
        return suffixes;
    }
}
