package org.helldev.latin;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Noun extends Word{

    String stem; // This is the part of the word which mostly doesnt change, usually it gets extendend by an Suffix depending on the context.
    Genus genus; //Nouns have grammatical Genders which have certain effects on Declinations.
    Map<CasusNumerus, String> suffixes; //This is where the possible suffixes of the Word are saved

    public Noun(String stem, Genus genus, Map<CasusNumerus, String> suffixes){
        this.stem = stem;
        this.genus = genus;
        this.suffixes = suffixes;
    }

    public String getString(Casus casus, Numerus nummerus){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stem);
        stringBuilder.append(suffixes.getOrDefault(new CasusNumerus(casus,nummerus), ""));
        // int numerusNumber = Numerus.values().findEquivalent(numerus).returnSpot()
        // int casusNumber = Casus.values().findEquivalent(casus).returnSpot()
        // stringBuilder.append(suffixes[numerusNumber][genusNumber]
        return stringBuilder.toString();
    }

    @Override
    public List<String> getAllForms() {
        List<String> list = new ArrayList<>();
        list.addAll(suffixes
                .values()
                .stream()
                .map(suffix -> new StringBuilder()
                        .append(stem)
                        .append(suffix)
                        .toString()));
        return list;
    }

   /* public String getNominativeSingular() {
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
    }*/
}
