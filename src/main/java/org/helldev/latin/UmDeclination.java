package org.helldev.latin;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * This Declination is for the words with a neutral Genus
 */

public class UmDeclination extends Noun{
    public UmDeclination(String stem) {
        super(stem, Genus.NEUTRUM, createBaseMap() );
    }
    private static @NotNull Map<CasusNumerus, String> createBaseMap(){
        Map<CasusNumerus, String> suffixes = new HashMap<CasusNumerus, String>();
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.SINGULAR), "um");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.SINGULAR), "i");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.SINGULAR), "o");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.SINGULAR), "um");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.SINGULAR), "o");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.SINGULAR), "um");
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.PLURAL), "a");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.PLURAL), "orum");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.PLURAL), "is");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.PLURAL), "a");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.PLURAL), "is");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.PLURAL), "a");
        return suffixes;
    }
}
