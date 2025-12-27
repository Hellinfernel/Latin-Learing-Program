package org.helldev.latin;

import java.util.HashMap;
import java.util.Map;

public class Esse extends Verb{
    public Esse() {
        super("",getForms(), "esse", new Fuisse());
    }
    public static Map<VerbProperties,String> getForms(){
        Map<VerbProperties, String> forms = new HashMap<>();
        forms.put(new VerbProperties(Person.FIRST,Numerus.SINGULAR,Tempus.PRESENT),"sum");
        forms.put(new VerbProperties(Person.SECOND,Numerus.SINGULAR,Tempus.PRESENT),"es");
        forms.put(new VerbProperties(Person.THIRD,Numerus.SINGULAR,Tempus.PRESENT),"est");
        forms.put(new VerbProperties(Person.FIRST,Numerus.PLURAL,Tempus.PRESENT),"sumus");
        forms.put(new VerbProperties(Person.SECOND,Numerus.PLURAL,Tempus.PRESENT),"estis");
        forms.put(new VerbProperties(Person.THIRD,Numerus.PLURAL,Tempus.PRESENT),"sunt");
        return forms;
    }
    public static class Fuisse extends PerfectForm{
        public Fuisse(){
            super("fu", "isse");
        }

        @Override
        public Map<VerbProperties, String> getSuffixes() {
            Map<VerbProperties, String> forms = new HashMap<>();
            forms.put(new VerbProperties(Person.FIRST,Numerus.SINGULAR,Tempus.PERFECT),"i");
            forms.put(new VerbProperties(Person.SECOND,Numerus.SINGULAR,Tempus.PERFECT),"isti");
            forms.put(new VerbProperties(Person.THIRD,Numerus.SINGULAR,Tempus.PERFECT),"it");
            forms.put(new VerbProperties(Person.FIRST,Numerus.PLURAL,Tempus.PERFECT),"imus");
            forms.put(new VerbProperties(Person.SECOND,Numerus.PLURAL,Tempus.PERFECT),"istis");
            forms.put(new VerbProperties(Person.THIRD,Numerus.PLURAL,Tempus.PERFECT),"erunt");
            return forms;
        }
    }
}
