package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class ThirdConjugation extends Verb {
    public ThirdConjugation(String stem, String infinitiveSuffix, String presentSuffix, PerfectForm perfectForm) {
        super(stem, getBaseMap(presentSuffix), infinitiveSuffix, perfectForm);
    }
    private static Map<VerbProperties, String> getBaseMap(String presentSuffix) {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        if (presentSuffix == "io"){
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR,Tempus.PRESENT), "io");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR,Tempus.PRESENT), "is");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR,Tempus.PRESENT), "it");
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL,Tempus.PRESENT), "imus");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL,Tempus.PRESENT), "itis");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL,Tempus.PRESENT), "iunt");
            
        }
        else{
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR,Tempus.PRESENT), "o");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR,Tempus.PRESENT), "is");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR,Tempus.PRESENT), "it");
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL,Tempus.PRESENT), "imus");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL,Tempus.PRESENT), "itis");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL,Tempus.PRESENT), "unt");
        }
        return suffixes;
    }
}
