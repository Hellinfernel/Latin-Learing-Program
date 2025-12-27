package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class UPerfectConjugation extends PerfectForm {
    public UPerfectConjugation(String stem) {
        
        super(stem, "uisse");
    }

    @Override
    public Map<VerbProperties, String> getSuffixes() {
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.SINGULAR,Tempus.PERFECT), "ui");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.SINGULAR,Tempus.PERFECT), "uisti");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.SINGULAR,Tempus.PERFECT), "uit");
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.PLURAL,Tempus.PERFECT), "uimus");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.PLURAL,Tempus.PERFECT), "uistis");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.PLURAL,Tempus.PERFECT), "uerunt");
        return suffixes;
    }
}
