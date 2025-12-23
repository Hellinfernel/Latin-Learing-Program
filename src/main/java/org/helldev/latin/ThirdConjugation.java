package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class ThirdConjugation extends Verb {
    public ThirdConjugation(String stem, String infinitiveSuffix, String presentSuffix) {
        super(stem, getBaseMap(presentSuffix), infinitiveSuffix);
    }
    private static Map<VerbProperties, String> getBaseMap(String presentSuffix) {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        if (presentSuffix == "io"){
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR), "io");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR), "is");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR), "it");
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL), "imus");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL), "itis");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL), "iunt");
            
        }
        else{
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.SINGULAR), "o");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.SINGULAR), "is");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.SINGULAR), "it");
            suffixes.put(new VerbProperties(Person.FIRST, Numerus.PLURAL), "imus");
            suffixes.put(new VerbProperties(Person.SECOND, Numerus.PLURAL), "itis");
            suffixes.put(new VerbProperties(Person.THIRD, Numerus.PLURAL), "unt");
        }
        return suffixes;
    }
}
