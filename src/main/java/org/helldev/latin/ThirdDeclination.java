package org.helldev.latin;

/**
 * This Declination serves the words who were to edgy to fit into the other three declinations like the good boys
 * 
 * "SARCASM"
 * */

public class ThirdDeclination extends Noun{
    private static final String[][] suffixes = new String[][]{}; //TODO: IMPLEMENT SUFFIXES IN RIGHT ORDER

    public ThirdDeclination(String stem, Genus genus) {
        super(stem, genus, suffixes);
    }
}
