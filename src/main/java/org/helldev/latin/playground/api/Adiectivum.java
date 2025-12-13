package org.helldev.latin.playground.api;

/**
 * API für Adjektive die definiert, welche Informationen (Categoriae) zum
 * "konfigurieren" eines Adjektives benötigt werden.
 * <p>
 * Deklination ist zum beispiel Teil der Implementierung von Adiectivum, nicht des Interfaces.
 */
public interface Adiectivum extends Vocabulum {
    // Abhängigkeit zu einem konkreten Substantiv das beschrieben werden soll
    Adiectivum congruere(Nomen nomen);

    // hier kommen alle Typen die konfiguriert werden können.
    Adiectivum genus(Categoriae.Genus g);

    Adiectivum casus(Categoriae.Casus c);

    Adiectivum numerus(Categoriae.Numerus n);
}
