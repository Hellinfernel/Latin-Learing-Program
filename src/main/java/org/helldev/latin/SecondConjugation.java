package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class SecondConjugation extends Verb {
    
    public SecondConjugation(String stem) {
        super(stem, getBaseMap(), getInfinitiveSuffix());
    }

    private static Map<VerbProperties, String> getBaseMap() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR), "eo");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR), "es");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR), "et");
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL), "emus");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL), "etis");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL), "ent");
        return suffixes;
    }
    private static String getInfinitiveSuffix(){
        return "ere";
        
    }
}
