package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class SPerfectConjugation extends PerfectForm {
    public SPerfectConjugation(String stem) {
        super(stem, "sisse");
    }

    @Override
    public Map<VerbProperties, String> getSuffixes() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.SINGULAR,Tempus.PERFECT), "si");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.SINGULAR,Tempus.PERFECT), "sisti");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.SINGULAR,Tempus.PERFECT), "sit");
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.PLURAL,Tempus.PERFECT), "simus");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.PLURAL,Tempus.PERFECT), "sistis");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.PLURAL,Tempus.PERFECT), "serunt");
        return suffixes;
         
    }
}
