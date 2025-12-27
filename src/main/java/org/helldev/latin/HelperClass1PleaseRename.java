package org.helldev.latin;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelperClass1PleaseRename { //TODO: Rename or Refactor
    public static Verb getCorrectDeclination(String infinitive, String PresenceSingular, String PerfectSingular){
        /**
         * This Method is supposed to return a Verb with the correct declination based on the infinitive and presence forms like they are found in Books.
         */
        PerfectForm perfectForm = getCorrectPerfectForm(PerfectSingular);
        String regex = "[aei]re$"; //The regex for finding the suffix of the infinitive
        Pattern infinitveSuffixPattern = Pattern.compile(regex); 
        Matcher infinitiveMatcher = infinitveSuffixPattern.matcher(infinitive);
        boolean gotMatch = infinitiveMatcher.find();
        String suffix = infinitiveMatcher.group(); // The string where I want to put the actual suffix into.
        switch (suffix) {
            case "are":
                return new FirstConjugation(String.join("",infinitive.split(regex)), perfectForm);
                
            case "ire":
                return new ForthConjugation(String.join("",infinitive.split(regex)),perfectForm);
                
            case "ere": // This case in particular is to differenciate between e-conjugation, consonantical conjugation and consunantical conjugation with -io extention.
                if (PresenceSingular.endsWith("io")){
                    return new ThirdConjugation(Arrays.stream(infinitive.split(regex)).findFirst().get(),"ere","io", perfectForm);
                } else if (PresenceSingular.endsWith("eo")) {
                    return new SecondConjugation(Arrays.stream(infinitive.split(regex)).findFirst().get(), perfectForm);
                } else {
                    return new ThirdConjugation(Arrays.stream(infinitive.split(regex)).findFirst().get(), "ere", "o", perfectForm);
                }
                
            default:
                throw new RuntimeException();
        }
    }
    public static PerfectForm getCorrectPerfectForm(String PerfectSingular){
        String regex = "[vusx]?i$";
        Pattern perfectSuffixPattern = Pattern.compile(regex);
        Matcher perfectMatcher = perfectSuffixPattern.matcher(PerfectSingular);
        boolean gotMatch = perfectMatcher.find();
        String suffix = perfectMatcher.group();
        switch (suffix){
            case "vi":
                return new VPerfectConjugation(String.join("", PerfectSingular.split(regex)));
            case "ui":
                return new UPerfectConjugation(String.join("", PerfectSingular.split(regex)));
            case "si":
                return new SPerfectConjugation(String.join("", PerfectSingular.split(regex)));
            case "xi":
                return new XPerfectConjugation(String.join("", PerfectSingular.split(regex)));
            case "i":
                return new IPerfectConjugation(String.join("", PerfectSingular.split(regex)));
            default:
                throw new RuntimeException("suffix not found");
        }
    }
}
