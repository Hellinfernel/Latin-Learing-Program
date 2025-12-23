package org.helldev.latin;

import java.util.Map;

public class Verb{
    String stem;
    Map<VerbProperties,String> suffixes;
    String infinitiveSuffix;
    
    
    public Verb(String stem, Map<VerbProperties,String> suffixes, String infinitiveSuffix){
        this.stem = stem;
        this.suffixes = suffixes;
        this.infinitiveSuffix = infinitiveSuffix;
    }
    public VerbStringBuilder getVerbStringBuilder(){
        return new VerbStringBuilder();
    }
    public class VerbStringBuilder {
        Numerus numerus = Numerus.SINGULAR;
        Person person = Person.FIRST;
        Modus modus = null;
        boolean infinitive = true;
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
        public String build() {
            StringBuilder stringBuilder = new StringBuilder();
            if (infinitive == true) {
                stringBuilder.append(stem)
                        .append(infinitiveSuffix);
                return stringBuilder.toString();
            } else {
                stringBuilder.append(stem)
                        .append(suffixes.getOrDefault(new VerbProperties(person, numerus), null));
                return stringBuilder.toString();
            }
        }
        
    }
}
