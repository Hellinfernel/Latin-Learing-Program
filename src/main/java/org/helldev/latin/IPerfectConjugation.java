package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class IPerfectConjugation extends PerfectForm {
    public IPerfectConjugation(String stem) {
        super(stem, "i");
    }

    @Override
    public Map<VerbProperties, String> getSuffixes() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.SINGULAR,Tempus.PERFECT), "i");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.SINGULAR,Tempus.PERFECT), "isti");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.SINGULAR,Tempus.PERFECT), "it");
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.PLURAL,Tempus.PERFECT), "imus");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.PLURAL,Tempus.PERFECT), "istis");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.PLURAL,Tempus.PERFECT), "erunt");
        return suffixes;
    }
}
