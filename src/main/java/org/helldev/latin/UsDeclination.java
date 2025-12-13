package org.helldev.latin;

/**
 * This Declination is for the words with a male Genus
 */
public class UsDeclination extends Noun{
    private static final String[][] suffixes = {
            {"us", "i", "o", "um", "e", "o"},
            {"í", "orum", "is", "os", "i", "is"}//TODO: CONTROL IF CASES ARE PLACED IN THE RIGHT ORDER, FUCKING IMPORTANT!!!
    };
    public UsDeclination(String stem) {
        super(stem, Genus.MASCULINUM, suffixes);
    }
}
