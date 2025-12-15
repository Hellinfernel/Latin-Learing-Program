package org.helldev.latin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTests {
    @Test
    public void Test1(){
//        Noun servus = new ThirdDeclination("serv", Genus.MASCULINUM);
//        Noun servum = new ThirdDeclination("serv", Genus.NEUTRUM);
//        Noun serva = new ThirdDeclination("serv", Genus.FEMININUM);
//        String nominativeMasculinumExpected = "servus";
//        assertEquals(nominativeMasculinumExpected,servus.getNominativeSingular());
//        String nominativeNeutrumExpected = "servum";
//        assertEquals(nominativeNeutrumExpected,servum.getNominativeSingular());
//        String nominativeFemininumExpected = "serva";
//        assertEquals(nominativeFemininumExpected,serva.getNominativeSingular());
        /*
        String genitiveExpected = "servi";
        String dativeExpected = "servo";
        String accusativeExpected = "servum";
        String ablativeExpected = "servo";
        String vocativeExpected = "serve";
        assertEquals(genitiveExpected,servus.getGenitiveSingular());
        assertEquals(dativeExpected,servus.getDativeSingular());
        assertEquals(accusativeExpected,servus.getAccusativeSingular());
        assertEquals(ablativeExpected,servus.getAblativeSingular());
        assertEquals(vocativeExpected,servus.getVocativeSingular());
        
         */
        
        
        Noun servus = new UsDeclination("serv");
        assertEquals("servus", servus.getString(Casus.NOMINATIVE, Numerus.SINGULAR));
    }
    
}
