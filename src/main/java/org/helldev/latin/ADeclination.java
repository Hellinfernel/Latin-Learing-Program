package org.helldev.latin;

/**
 * This Declination is for the words with a female Genus
 */

public class ADeclination extends Noun{
//    private static final String[][] suffixes = {
//            {"a", "ae", "ae", "am", "a", "a"},
//            {"ae", "arum", "is", "as", "ae", "is"}//TODO: CONTROL IF CASES ARE PLACED IN THE RIGHT ORDER, FUCKING IMPORTANT!!!
//    };
    public ADeclination(String stem) {
        super(stem, Genus.FEMININUM,null); //TODO: REMOVE NULL
    }
}
