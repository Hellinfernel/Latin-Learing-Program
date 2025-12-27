package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class ForthConjugation extends Verb{
    public ForthConjugation(String stem, PerfectForm perfectForm) {
        super(stem, getBaseMap(), "ire", perfectForm);
    }
    private static Map<VerbProperties, String> getBaseMap() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR,Tempus.PRESENT), "io");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR,Tempus.PRESENT), "is");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR,Tempus.PRESENT), "it");
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL,Tempus.PRESENT), "imus");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL,Tempus.PRESENT), "itis");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL,Tempus.PRESENT), "iunt");
        return suffixes;
    }
}
