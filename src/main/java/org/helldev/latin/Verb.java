package org.helldev.latin;

import org.helldev.latin.playground.api.Categoriae;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Verb extends Word{
    String stem;
    Map<VerbProperties,String> suffixes;
    String infinitiveSuffix;
    PerfectForm perfectForm; //TODO: I am not exactly happy with how I implemented perfectForms, may consider refactoring.
    
    
    public Verb(String stem, Map<VerbProperties,String> suffixes, String infinitiveSuffix, PerfectForm perfectForm){
        this.stem = stem;
        this.suffixes = suffixes;
        suffixes.putAll(perfectForm.getSuffixes());
        this.infinitiveSuffix = infinitiveSuffix;
        this.perfectForm = perfectForm;
    }
    public VerbStringBuilder getVerbStringBuilder(){
        return new VerbStringBuilder();
    }

    @Override
    public List<String> getAllForms() {
        List<String> list = new ArrayList<>();
        list.add(new StringBuilder().append(stem).append(infinitiveSuffix).toString());
        list.add(new StringBuilder().append(perfectForm.getStem()).append(perfectForm.getInfiniteSuffix()).toString());
        list.addAll(suffixes.values()
                .stream()
                .map(suffix -> new StringBuilder()
                        .append(stem)
                        .append(suffix)
                        .toString()));
        list.addAll(perfectForm.getSuffixes()
                .values()
                .stream()
                .map(suffix -> new StringBuilder()
                        .append(perfectForm.getStem())
                        .append(suffix)
                        .toString()));
        return list;
    }

    public class VerbStringBuilder {
        Numerus numerus = Numerus.SINGULAR;
        Person person = Person.FIRST;
        Modus modus = null;
        boolean infinitive = true;
        Tempus tempus = Tempus.PRESENT; //TODO: Should a StringBuilder have default States?
        public VerbStringBuilder(){}
        public VerbStringBuilder numerus(Numerus numerus){
            this.numerus = numerus;
            return this;
        }
        public VerbStringBuilder singular(){
            numerus = Numerus.SINGULAR;
            return this;
        }
        public VerbStringBuilder plural(){
            numerus = Numerus.PLURAL;
            return this;
        }
        public VerbStringBuilder person(Person person){
            this.person = person;
            return this;
        }
        public VerbStringBuilder first(){
            person = Person.FIRST;
            return this;
        }
        public VerbStringBuilder second(){
            person = Person.SECOND;
            return this;
        }
        public VerbStringBuilder third(){
            person = Person.THIRD;
            return this;
        }


        public VerbStringBuilder modus(Modus modus){
            if(modus != null){
                infinitive = false;
                this.modus = modus;
            }
            return this;
        }
        public VerbStringBuilder indicative(){
            modus = Modus.INDICATIVE;
            infinitive = false;
            return this;
        }
        public VerbStringBuilder infinitive(){
            modus = null;
            infinitive = true;
            return this;
        }
//        public VerbStringBuilder infinitive(boolean bool){
//            
//            infinitive = bool;
//            return this;
//        }
        public VerbStringBuilder tempus (Tempus tempus){
            this.tempus = tempus;
            return this;
        }
        public VerbStringBuilder present(){
            tempus = Tempus.PRESENT;
            return this;
        }
        public VerbStringBuilder perfect(){
            tempus = Tempus.PERFECT;
            return this;
        }
        public String build() {
            StringBuilder stringBuilder = new StringBuilder();
            if (infinitive == true) {
                switch (tempus){
                    case PERFECT -> stringBuilder.append(perfectForm.getStem()).append(perfectForm.getInfiniteSuffix());
                    case PRESENT -> stringBuilder.append(stem).append(infinitiveSuffix);
                    
                }

                return stringBuilder.toString();
            } else {
                switch (tempus){
                    case PERFECT -> stringBuilder.append(perfectForm.getStem());
                    case PRESENT -> stringBuilder.append(stem);
                }
                stringBuilder.append(suffixes.getOrDefault(new VerbProperties(person, numerus, tempus), null));
                return stringBuilder.toString();
            }
        }
        
    }
}
