package org.helldev.latin;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * This Declination is for the words with a female Genus
 */

public class ADeclination extends Noun{


    public ADeclination(String stem) {
        super(stem, Genus.FEMININUM,createBaseMap());
    }
    private static @NotNull Map<CasusNumerus, String> createBaseMap(){
        Map<CasusNumerus, String> suffixes = new HashMap<CasusNumerus, String>();
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.SINGULAR), "a");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.SINGULAR), "ae");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.SINGULAR), "ae");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.SINGULAR), "am");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.SINGULAR), "a");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.SINGULAR), "a");
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.PLURAL), "ae");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.PLURAL), "arum");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.PLURAL), "is");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.PLURAL), "as");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.PLURAL), "is");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.PLURAL), "ae");
        return suffixes;
    }
}
