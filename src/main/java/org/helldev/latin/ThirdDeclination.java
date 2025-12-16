package org.helldev.latin;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * This Declination serves the words who were to edgy to fit into the other three declinations like the good boys
 * 
 * "SARCASM"
 * */

public class ThirdDeclination extends Noun{

    public ThirdDeclination(String stem, Genus genus) {
        super(stem, genus, createBaseMap());
    }
    private static @NotNull Map<CasusNumerus, String> createBaseMap(){
        Map<CasusNumerus, String> suffixes = new HashMap<CasusNumerus, String>();
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.SINGULAR), "");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.SINGULAR), "is");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.SINGULAR), "i");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.SINGULAR), "em");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.SINGULAR), "e");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.SINGULAR), "");
        suffixes.put(new CasusNumerus(Casus.NOMINATIVE, Numerus.PLURAL), "es");
        suffixes.put(new CasusNumerus(Casus.GENITIVE, Numerus.PLURAL), "um");
        suffixes.put(new CasusNumerus(Casus.DATIVE, Numerus.PLURAL), "ibus");
        suffixes.put(new CasusNumerus(Casus.ACCUSATIVE, Numerus.PLURAL), "es");
        suffixes.put(new CasusNumerus(Casus.ABLATIVE, Numerus.PLURAL), "ibus");
        suffixes.put(new CasusNumerus(Casus.VOCATIVE, Numerus.PLURAL), "es");
        return suffixes;
    }
}
