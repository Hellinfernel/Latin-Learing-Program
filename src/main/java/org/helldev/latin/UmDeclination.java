package org.helldev.latin;

/**
 * This Declination is for the words with a neutral Genus
 */

public class UmDeclination extends Noun{
    private static final String[][] suffixes = new String[][]{}; //TODO: IMPLEMENT SUFFIXES IN RIGHT ORDER
    public UmDeclination(String stem) {
        super(stem, Genus.NEUTRUM, suffixes);
    }
}
