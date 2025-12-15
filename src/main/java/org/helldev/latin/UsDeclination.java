package org.helldev.latin;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * This Declination is for the words with a male Genus
 */
public class UsDeclination extends Noun{
    public UsDeclination(String stem) {
        super(stem, Genus.MASCULINUM, createBaseMap());
    }
    private static @NotNull Map<CasusNumerus, String> createBaseMap(){
        Map<CasusNumerus, String> suffixes = new HashMap<CasusNumerus, String>();
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.SINGULAR), "us");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.SINGULAR), "i");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.SINGULAR), "o");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.SINGULAR), "um");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.SINGULAR), "o");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.SINGULAR), "e");
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.PLURAL), "i");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.PLURAL), "orum");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.PLURAL), "is");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.PLURAL), "os");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.PLURAL), "is");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.PLURAL), "i");
        return suffixes;
    }
}
