package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;



public class FirstConjugation extends Verb {
    public FirstConjugation(String stem, PerfectForm perfectForm) {
        super(stem, getBaseMap(), "are",perfectForm);
    }
    private static Map<VerbProperties, String> getBaseMap() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR,Tempus.PRESENT), "o");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR,Tempus.PRESENT), "as");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR,Tempus.PRESENT), "at");
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL,Tempus.PRESENT), "amus");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL,Tempus.PRESENT), "atis");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL,Tempus.PRESENT), "ant");
        return suffixes;
    }
}
