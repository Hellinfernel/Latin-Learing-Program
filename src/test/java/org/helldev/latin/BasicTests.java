package org.helldev.latin;

import org.junit.jupiter.api.Test;

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
        Verb amare = new FirstConjugation("am");
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
        Verb gaudere = new SecondConjugation("gaud");
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
        Verb tegere = new ThirdConjugation("teg", "ere", "o");
        assertThat(tegere.getVerbStringBuilder().build()).isEqualTo("tegere");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("tego");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("tegis");
        assertThat(tegere.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("tegit");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("tegimus");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("tegitis");
        assertThat(tegere.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("tegunt");
        
        Verb capere = new ThirdConjugation("cap", "ere", "io");
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
        Verb audire = new ForthConjugation("aud");
        assertThat(audire.getVerbStringBuilder().build()).isEqualTo("audire");
        assertThat(audire.getVerbStringBuilder().indicative().singular().first().build()).isEqualTo("audio");
        assertThat(audire.getVerbStringBuilder().indicative().singular().second().build()).isEqualTo("audis");
        assertThat(audire.getVerbStringBuilder().indicative().singular().third().build()).isEqualTo("audit");
        assertThat(audire.getVerbStringBuilder().indicative().plural().first().build()).isEqualTo("audimus");
        assertThat(audire.getVerbStringBuilder().indicative().plural().second().build()).isEqualTo("auditis");
        assertThat(audire.getVerbStringBuilder().indicative().plural().third().build()).isEqualTo("audiunt");
    }
    
    
}
