package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;



public class FirstConjugation extends Verb {
    public FirstConjugation(String stem) {
        super(stem, getBaseMap(), "are");
    }
    private static Map<VerbProperties, String> getBaseMap() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR), "o");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR), "as");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR), "at");
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL), "amus");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL), "atis");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL), "ant");
        return suffixes;
    }
}
