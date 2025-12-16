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
    
}
