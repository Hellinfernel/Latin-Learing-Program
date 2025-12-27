package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class VPerfectConjugation extends PerfectForm{
    
    public VPerfectConjugation(String stem){
        super(stem, "visse");
    }
    

    public Map<VerbProperties,String> getSuffixes(){
        Map<VerbProperties,String> suffixes = new HashMap<>();
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.SINGULAR,Tempus.PERFECT), "vi");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.SINGULAR,Tempus.PERFECT), "visti");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.SINGULAR,Tempus.PERFECT), "vit");
        suffixes.put(new VerbProperties(Person.FIRST,Numerus.PLURAL,Tempus.PERFECT), "vimus");
        suffixes.put(new VerbProperties(Person.SECOND,Numerus.PLURAL,Tempus.PERFECT), "vistis");
        suffixes.put(new VerbProperties(Person.THIRD,Numerus.PLURAL,Tempus.PERFECT), "verunt");
        return suffixes;
    }
}
