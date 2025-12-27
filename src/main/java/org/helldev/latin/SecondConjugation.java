package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class SecondConjugation extends Verb {
    
    public SecondConjugation(String stem, PerfectForm perfectForm) {
        super(stem, getBaseMap(), getInfinitiveSuffix(),perfectForm);
    }

    private static Map<VerbProperties, String> getBaseMap() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR,Tempus.PRESENT), "eo");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR,Tempus.PRESENT), "es");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR,Tempus.PRESENT), "et");
        suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL,Tempus.PRESENT), "emus");
        suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL,Tempus.PRESENT), "etis");
        suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL,Tempus.PRESENT), "ent");
        return suffixes;
    }
    private static String getInfinitiveSuffix(){
        return "ere";
        
    }
}
