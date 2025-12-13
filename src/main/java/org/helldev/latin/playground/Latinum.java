package org.helldev.latin.playground;

import org.helldev.latin.playground.api.Adiectivum;
import org.helldev.latin.playground.api.Nomen;
import org.helldev.latin.playground.api.Verbum;
import org.helldev.latin.playground.api.Vocabulum;

/**
 * kleine "high level" API/Factory zur einfacheren Verwendung, vorallem in Tests
 */
public class Latinum {
    public static Nomen substantivum(String lemma) {
        return null;
    }

    public static Verbum verbum(String lemma) {
        return null;
    }

    public static Adiectivum adiectivum(String lemma) {
        return null;
    }

    public static String sententia(Vocabulum... verba) {
        return null;
    }
}
