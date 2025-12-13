package org.helldev.latin.playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LatinumTest {
    @Test
    void testSentence() {
        final var servus = Latinum.substantivum("serv");
        final var fidelis = Latinum.adiectivum("fidel");
        final var amicam = Latinum.substantivum("amic");
        final var laudat = Latinum.verbum("laud");

        final var sentence = Latinum.sententia(servus, fidelis, amicam, laudat);
        assertThat(sentence).isEqualTo("servus fidelis amicam laudat.");
    }
}