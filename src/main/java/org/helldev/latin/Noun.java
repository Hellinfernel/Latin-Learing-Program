package org.helldev.latin;

public class Noun {

    String stem; // This is the part of the word which mostly doesnt change, usually it gets extendend by an Suffix depending on the context.
    Genus genus; //Nouns have grammatical Genders which have certain effects on Declinations.
    String[][] suffixes = new String[Numerus.values().length][Person.values().length]; //This is where the possible suffixes of the Word are saved

    public Noun(String stem, Genus genus, String[][] suffixes){
        this.stem = stem;
        this.genus = genus;
        for (int i = 0; i < suffixes.length; i++) {
            System.arraycopy(suffixes[i], 0, this.suffixes[i], 0, suffixes[i].length);

        }
    }

    public String getString(Casus casus, Numerus nummerus){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stem);
        // int numerusNumber = Numerus.values().findEquivalent(numerus).returnSpot()
        // int casusNumber = Casus.values().findEquivalent(casus).returnSpot()
        // stringBuilder.append(suffixes[numerusNumber][genusNumber]
        return stringBuilder.toString();
    }

    public String getNominativeSingular() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stem);
        String suffix = "";
        switch (genus){
            case NEUTRUM -> {
                suffix = "um";
                break;
            }
            case MASCULINUM -> {
                suffix = "us";
                break;
            }
            case FEMININUM -> {
                suffix = "a";
                break;
            }
        }
        stringBuilder.append(suffix);
        return stringBuilder.toString();
    }
}
