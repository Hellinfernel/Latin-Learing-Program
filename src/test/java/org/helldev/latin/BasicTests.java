package org.helldev.latin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class BasicTests {
    @Test
    public void Test1(){
        Noun servus = new UsDeclination("serv");
        Noun forum = new UmDeclination("for");
        assertThat(servus.getString(Casus.NOMINATIVE, Numerus.SINGULAR)).isEqualTo("servus");
        assertThat(servus.getString(Casus.GENITIVE, Numerus.SINGULAR)).isEqualTo("servi");
        assertThat(servus.getString(Casus.DATIVE, Numerus.SINGULAR)).isEqualTo("servo");
        assertThat(servus.getString(Casus.ACCUSATIVE, Numerus.SINGULAR)).isEqualTo("servum");
        assertThat(servus.getString(Casus.ABLATIVE, Numerus.SINGULAR)).isEqualTo("servo");
        assertThat(servus.getString(Casus.VOCATIVE, Numerus.SINGULAR)).isEqualTo("serve");
        assertThat(servus.getString(Casus.NOMINATIVE, Numerus.PLURAL)).isEqualTo("servi");
        assertThat(servus.getString(Casus.GENITIVE, Numerus.PLURAL)).isEqualTo("servorum");
        assertThat(servus.getString(Casus.DATIVE, Numerus.PLURAL)).isEqualTo("servis");
        assertThat(servus.getString(Casus.ACCUSATIVE, Numerus.PLURAL)).isEqualTo("servos");
        assertThat(servus.getString(Casus.ABLATIVE, Numerus.PLURAL)).isEqualTo("servis");
        assertThat(servus.getString(Casus.VOCATIVE, Numerus.PLURAL)).isEqualTo("servi");
        assertThat(forum.getString(Casus.NOMINATIVE, Numerus.SINGULAR)).isEqualTo("forum");
        assertThat(forum.getString(Casus.GENITIVE, Numerus.SINGULAR)).isEqualTo("fori");
        assertThat(forum.getString(Casus.DATIVE, Numerus.SINGULAR)).isEqualTo("foro");
        assertThat(forum.getString(Casus.ACCUSATIVE, Numerus.SINGULAR)).isEqualTo("forum");
        assertThat(forum.getString(Casus.ABLATIVE, Numerus.SINGULAR)).isEqualTo("foro");
        assertThat(forum.getString(Casus.NOMINATIVE, Numerus.SINGULAR)).isEqualTo("forum");
        assertThat(forum.getString(Casus.NOMINATIVE, Numerus.PLURAL)).isEqualTo("fora");
        assertThat(forum.getString(Casus.GENITIVE, Numerus.PLURAL)).isEqualTo("fororum");
        assertThat(forum.getString(Casus.DATIVE, Numerus.PLURAL)).isEqualTo("foris");
        assertThat(forum.getString(Casus.ACCUSATIVE, Numerus.PLURAL)).isEqualTo("fora");
        assertThat(forum.getString(Casus.ABLATIVE, Numerus.PLURAL)).isEqualTo("foris");
        assertThat(forum.getString(Casus.NOMINATIVE, Numerus.PLURAL)).isEqualTo("fora");
    }
    @Test
    public void TestADeclination(){
        Noun porta = new ADeclination("port");
        assertThat(porta.getString(Casus.NOMINATIVE,Numerus.SINGULAR)).isEqualTo("porta");
        assertThat(porta.getString(Casus.GENITIVE,Numerus.SINGULAR)).isEqualTo("portae");
        assertThat(porta.getString(Casus.DATIVE,Numerus.SINGULAR)).isEqualTo("portae");
        assertThat(porta.getString(Casus.ACCUSATIVE,Numerus.SINGULAR)).isEqualTo("portam");
        assertThat(porta.getString(Casus.ABLATIVE,Numerus.SINGULAR)).isEqualTo("porta");
        assertThat(porta.getString(Casus.VOCATIVE,Numerus.SINGULAR)).isEqualTo("porta");
        assertThat(porta.getString(Casus.NOMINATIVE,Numerus.PLURAL)).isEqualTo("portae");
        assertThat(porta.getString(Casus.GENITIVE,Numerus.PLURAL)).isEqualTo("portarum");
        assertThat(porta.getString(Casus.DATIVE,Numerus.PLURAL)).isEqualTo("portis");
        assertThat(porta.getString(Casus.ACCUSATIVE,Numerus.PLURAL)).isEqualTo("portas");
        assertThat(porta.getString(Casus.ABLATIVE,Numerus.PLURAL)).isEqualTo("portis");
        assertThat(porta.getString(Casus.VOCATIVE,Numerus.PLURAL)).isEqualTo("portae");
    }
    @Test
    public void TestThirdDeclination(){
        Noun senator = new ThirdDeclination("senator", Genus.MASCULINUM);
        assertThat(senator.getString(Casus.NOMINATIVE,Numerus.SINGULAR)).isEqualTo("senator");
        assertThat(senator.getString(Casus.GENITIVE,Numerus.SINGULAR)).isEqualTo("senatoris");
        assertThat(senator.getString(Casus.DATIVE,Numerus.SINGULAR)).isEqualTo("senatori");
        assertThat(senator.getString(Casus.ACCUSATIVE,Numerus.SINGULAR)).isEqualTo("senatorem");
        assertThat(senator.getString(Casus.ABLATIVE,Numerus.SINGULAR)).isEqualTo("senatore");
        assertThat(senator.getString(Casus.VOCATIVE,Numerus.SINGULAR)).isEqualTo("senator");
        assertThat(senator.getString(Casus.NOMINATIVE,Numerus.PLURAL)).isEqualTo("senatores");
        assertThat(senator.getString(Casus.GENITIVE,Numerus.PLURAL)).isEqualTo("senatorum");
        assertThat(senator.getString(Casus.DATIVE,Numerus.PLURAL)).isEqualTo("senatoribus");
        assertThat(senator.getString(Casus.ACCUSATIVE,Numerus.PLURAL)).isEqualTo("senatores");
        assertThat(senator.getString(Casus.ABLATIVE,Numerus.PLURAL)).isEqualTo("senatoribus");
        assertThat(senator.getString(Casus.VOCATIVE,Numerus.PLURAL)).isEqualTo("senatores");
    
    }
    @Test
    public void TestFirstConjugation(){
        Verb amare = new FirstConjugation("am", new VPerfectConjugation("ama"));
        assertThat(amare.getVerbStringBuilder().build()).isEqualTo("amare");
        assertThat(amare.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.SINGULAR).person(Person.FIRST).build()).isEqualTo("amo");
        assertThat(amare.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.SINGULAR).person(Person.SECOND).build()).isEqualTo("amas");
        assertThat(amare.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.SINGULAR).person(Person.THIRD).build()).isEqualTo("amat");
        assertThat(amare.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.PLURAL).person(Person.FIRST).build()).isEqualTo("amamus");
        assertThat(amare.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.PLURAL).person(Person.SECOND).build()).isEqualTo("amatis");
        assertThat(amare.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.PLURAL).person(Person.THIRD).build()).isEqualTo("amant");
        assertThat(amare.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("amo");
        assertThat(amare.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("amas");
        assertThat(amare.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("amat");
        assertThat(amare.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("amamus");
        assertThat(amare.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("amatis");
        assertThat(amare.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("amant");
        
    }
    @Test
    public void TestSecondConjugation(){
        Verb gaudere = new SecondConjugation("gaud", new NullForm());
        assertThat(gaudere.getVerbStringBuilder().build()).isEqualTo("gaudere");
        assertThat(gaudere.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.SINGULAR).person(Person.FIRST).build()).isEqualTo("gaudeo");
        assertThat(gaudere.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.SINGULAR).person(Person.SECOND).build()).isEqualTo("gaudes");
        assertThat(gaudere.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.SINGULAR).person(Person.THIRD).build()).isEqualTo("gaudet");
        assertThat(gaudere.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.PLURAL).person(Person.FIRST).build()).isEqualTo("gaudemus");
        assertThat(gaudere.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.PLURAL).person(Person.SECOND).build()).isEqualTo("gaudetis");
        assertThat(gaudere.getVerbStringBuilder().modus(Modus.INDICATIVE).numerus(Numerus.PLURAL).person(Person.THIRD).build()).isEqualTo("gaudent");
        assertThat(gaudere.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("gaudeo");
        assertThat(gaudere.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("gaudes");
        assertThat(gaudere.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("gaudet");
        assertThat(gaudere.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("gaudemus");
        assertThat(gaudere.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("gaudetis");
        assertThat(gaudere.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("gaudent");
        
    }
    @Test
    public void TestThirdConjugation(){
        Verb tegere = new ThirdConjugation("teg", "ere", "o", new NullForm());
        assertThat(tegere.getVerbStringBuilder().build()).isEqualTo("tegere");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("tego");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("tegis");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("tegit");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("tegimus");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("tegitis");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("tegunt");
        
        Verb capere = new ThirdConjugation("cap", "ere", "io", new NullForm());
        assertThat(capere.getVerbStringBuilder().build()).isEqualTo("capere");
        assertThat(capere.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("capio");
        assertThat(capere.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("capis");
        assertThat(capere.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("capit");
        assertThat(capere.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("capimus");
        assertThat(capere.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("capitis");
        assertThat(capere.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("capiunt");
        
        
    }
    @Test
    public void TestForthConjugation(){
        Verb audire = new ForthConjugation("aud", new NullForm());
        assertThat(audire.getVerbStringBuilder().build()).isEqualTo("audire");
        assertThat(audire.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("audio");
        assertThat(audire.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("audis");
        assertThat(audire.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("audit");
        assertThat(audire.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("audimus");
        assertThat(audire.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("auditis");
        assertThat(audire.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("audiunt");
    }
    
    @Test
    public void TestHelperClass1(){
        Verb gaudere = HelperClass1PleaseRename.getCorrectDeclination("gaudere", "gaudeo", "null");
        assertThat(gaudere.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("gaudeo");
        assertThat(gaudere.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("gaudes");
        assertThat(gaudere.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("gaudet");
        assertThat(gaudere.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("gaudemus");
        assertThat(gaudere.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("gaudetis");
        assertThat(gaudere.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("gaudent");

        Verb tegere = HelperClass1PleaseRename.getCorrectDeclination("tegere", "tego", "null");
        assertThat(tegere.getVerbStringBuilder().build()).isEqualTo("tegere");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("tego");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("tegis");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("tegit");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("tegimus");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("tegitis");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("tegunt");

        Verb capere = HelperClass1PleaseRename.getCorrectDeclination("capere","capio", "null");
        assertThat(capere.getVerbStringBuilder().build()).isEqualTo("capere");
        assertThat(capere.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("capio");
        assertThat(capere.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("capis");
        assertThat(capere.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("capit");
        assertThat(capere.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("capimus");
        assertThat(capere.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("capitis");
        assertThat(capere.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("capiunt");
    }
    
    @Test
    public void TestVPerfectConjugation(){
        Verb laudare = HelperClass1PleaseRename.getCorrectDeclination("laudare","laudo","laudavi");
        assertThat(laudare.perfectForm.getStem()).isEqualTo("lauda");
        assertThat(laudare.getVerbStringBuilder().infinitive().build()).isEqualTo("laudare");
        assertThat(laudare.getVerbStringBuilder().indicative().present().first().singular().build()).isEqualTo("laudo");
        assertThat(laudare.getVerbStringBuilder().indicative().present().second().singular().build()).isEqualTo("laudas");
        assertThat(laudare.getVerbStringBuilder().indicative().present().third().singular().build()).isEqualTo("laudat");
        assertThat(laudare.getVerbStringBuilder().indicative().present().first().plural().build()).isEqualTo("laudamus");
        assertThat(laudare.getVerbStringBuilder().indicative().present().second().plural().build()).isEqualTo("laudatis");
        assertThat(laudare.getVerbStringBuilder().indicative().present().third().plural().build()).isEqualTo("laudant");
        
        
        assertThat(laudare.getVerbStringBuilder().infinitive().perfect().build()).isEqualTo("laudavisse"); 
        assertThat(laudare.getVerbStringBuilder().indicative().perfect().first().singular().build()).isEqualTo("laudavi");
        assertThat(laudare.getVerbStringBuilder().indicative().perfect().second().singular().build()).isEqualTo("laudavisti");
        assertThat(laudare.getVerbStringBuilder().indicative().perfect().third().singular().build()).isEqualTo("laudavit");
        assertThat(laudare.getVerbStringBuilder().indicative().perfect().first().plural().build()).isEqualTo("laudavimus");
        assertThat(laudare.getVerbStringBuilder().indicative().perfect().second().plural().build()).isEqualTo("laudavistis");
        assertThat(laudare.getVerbStringBuilder().indicative().perfect().third().plural().build()).isEqualTo("laudaverunt");

    }
    
    @Test
    public void TestEsse(){
        Verb esse = new Esse();
        
        assertThat(esse.getVerbStringBuilder().build()).isEqualTo("esse");
        assertThat(esse.getVerbStringBuilder().indicative().present().first().singular().build()).isEqualTo("sum");
        assertThat(esse.getVerbStringBuilder().indicative().present().second().singular().build()).isEqualTo("es");
        assertThat(esse.getVerbStringBuilder().indicative().present().third().singular().build()).isEqualTo("est");
        assertThat(esse.getVerbStringBuilder().indicative().present().first().plural().build()).isEqualTo("sumus");
        assertThat(esse.getVerbStringBuilder().indicative().present().second().plural().build()).isEqualTo("estis");
        assertThat(esse.getVerbStringBuilder().indicative().present().third().plural().build()).isEqualTo("sunt");

        assertThat(esse.getVerbStringBuilder().infinitive().perfect().build()).isEqualTo("fuisse");
        assertThat(esse.getVerbStringBuilder().indicative().perfect().first().singular().build()).isEqualTo("fui");
        assertThat(esse.getVerbStringBuilder().indicative().perfect().second().singular().build()).isEqualTo("fuisti");
        assertThat(esse.getVerbStringBuilder().indicative().perfect().third().singular().build()).isEqualTo("fuit");
        assertThat(esse.getVerbStringBuilder().indicative().perfect().first().plural().build()).isEqualTo("fuimus");
        assertThat(esse.getVerbStringBuilder().indicative().perfect().second().plural().build()).isEqualTo("fuistis");
        assertThat(esse.getVerbStringBuilder().indicative().perfect().third().plural().build()).isEqualTo("fuerunt");
    }
    
    @Test
    public void TestUPerfectConjugation(){
        Verb tacere = HelperClass1PleaseRename.getCorrectDeclination("tacere", "taceo","tacui");

        assertThat(tacere.getVerbStringBuilder().infinitive().build()).isEqualTo("tacere");
        assertThat(tacere.getVerbStringBuilder().indicative().present().first().singular().build()).isEqualTo("taceo");
        assertThat(tacere.getVerbStringBuilder().indicative().present().second().singular().build()).isEqualTo("taces");
        assertThat(tacere.getVerbStringBuilder().indicative().present().third().singular().build()).isEqualTo("tacet");
        assertThat(tacere.getVerbStringBuilder().indicative().present().first().plural().build()).isEqualTo("tacemus");
        assertThat(tacere.getVerbStringBuilder().indicative().present().second().plural().build()).isEqualTo("tacetis");
        assertThat(tacere.getVerbStringBuilder().indicative().present().third().plural().build()).isEqualTo("tacent");
        
        
        assertThat(tacere.getVerbStringBuilder().infinitive().perfect().build()).isEqualTo("tacuisse");
        assertThat(tacere.getVerbStringBuilder().indicative().perfect().first().singular().build()).isEqualTo("tacui");
        assertThat(tacere.getVerbStringBuilder().indicative().perfect().second().singular().build()).isEqualTo("tacuisti");
        assertThat(tacere.getVerbStringBuilder().indicative().perfect().third().singular().build()).isEqualTo("tacuit");
        assertThat(tacere.getVerbStringBuilder().indicative().perfect().first().plural().build()).isEqualTo("tacuimus");
        assertThat(tacere.getVerbStringBuilder().indicative().perfect().second().plural().build()).isEqualTo("tacuistis");
        assertThat(tacere.getVerbStringBuilder().indicative().perfect().third().plural().build()).isEqualTo("tacuerunt");

    }
    
    @Test
    public void TestSPerfectConjugation(){
        
        Verb ludere = HelperClass1PleaseRename.getCorrectDeclination("ludere", "ludo", "lusi");

        assertThat(ludere.getVerbStringBuilder().infinitive().build()).isEqualTo("ludere");
        assertThat(ludere.getVerbStringBuilder().indicative().present().first().singular().build()).isEqualTo("ludo");
        assertThat(ludere.getVerbStringBuilder().indicative().present().second().singular().build()).isEqualTo("ludis");
        assertThat(ludere.getVerbStringBuilder().indicative().present().third().singular().build()).isEqualTo("ludit");
        assertThat(ludere.getVerbStringBuilder().indicative().present().first().plural().build()).isEqualTo("ludimus");
        assertThat(ludere.getVerbStringBuilder().indicative().present().second().plural().build()).isEqualTo("luditis");
        assertThat(ludere.getVerbStringBuilder().indicative().present().third().plural().build()).isEqualTo("ludunt");
        
        
        assertThat(ludere.getVerbStringBuilder().infinitive().perfect().build()).isEqualTo("lusisse");           
        assertThat(ludere.getVerbStringBuilder().indicative().perfect().first().singular().build()).isEqualTo("lusi");
        assertThat(ludere.getVerbStringBuilder().indicative().perfect().second().singular().build()).isEqualTo("lusisti");
        assertThat(ludere.getVerbStringBuilder().indicative().perfect().third().singular().build()).isEqualTo("lusit");
        assertThat(ludere.getVerbStringBuilder().indicative().perfect().first().plural().build()).isEqualTo("lusimus");
        assertThat(ludere.getVerbStringBuilder().indicative().perfect().second().plural().build()).isEqualTo("lusistis");
        assertThat(ludere.getVerbStringBuilder().indicative().perfect().third().plural().build()).isEqualTo("luserunt");
        
        
        
    }
    @Test
    public void TextXPerfectConjugation(){

        Verb intellegere = HelperClass1PleaseRename.getCorrectDeclination("intellegere", "intellego", "intellexi");

        assertThat(intellegere.getVerbStringBuilder().infinitive().build()).isEqualTo("intellegere");
        assertThat(intellegere.getVerbStringBuilder().indicative().present().first().singular().build()).isEqualTo("intellego");
        assertThat(intellegere.getVerbStringBuilder().indicative().present().second().singular().build()).isEqualTo("intellegis");
        assertThat(intellegere.getVerbStringBuilder().indicative().present().third().singular().build()).isEqualTo("intellegit");
        assertThat(intellegere.getVerbStringBuilder().indicative().present().first().plural().build()).isEqualTo("intellegimus");
        assertThat(intellegere.getVerbStringBuilder().indicative().present().second().plural().build()).isEqualTo("intellegitis");
        assertThat(intellegere.getVerbStringBuilder().indicative().present().third().plural().build()).isEqualTo("intellegunt");


        assertThat(intellegere.getVerbStringBuilder().infinitive().perfect().build()).isEqualTo("intellexisse");
        assertThat(intellegere.getVerbStringBuilder().indicative().perfect().first().singular().build()).isEqualTo("intellexi");
        assertThat(intellegere.getVerbStringBuilder().indicative().perfect().second().singular().build()).isEqualTo("intellexisti");
        assertThat(intellegere.getVerbStringBuilder().indicative().perfect().third().singular().build()).isEqualTo("intellexit");
        assertThat(intellegere.getVerbStringBuilder().indicative().perfect().first().plural().build()).isEqualTo("intelleximus");
        assertThat(intellegere.getVerbStringBuilder().indicative().perfect().second().plural().build()).isEqualTo("intellexistis");
        assertThat(intellegere.getVerbStringBuilder().indicative().perfect().third().plural().build()).isEqualTo("intellexerunt");
        
    }
    
    
}
