package org.helldev.latin.playground.api;

/**
 * API für Substantive die definiert, welche Informationen (Categoriae) zum
 * "konfigurieren" eines Substantiv benötigt werden.
 * <p>
 * Deklination ist zum beispiel Teil der Implementierung von Nomen, nicht des Interfaces.
 */
public interface Nomen extends Vocabulum {
    // Genus ist hier fix nach Erstellung des Substantivs, könnte aber auch weiter unten konfigurierbar gemacht werden
    Categoriae.Genus getGenus();

    // hier kommen alle Typen die konfiguriert werden können.
    Nomen casus(Categoriae.Casus c);

    Nomen numerus(Categoriae.Numerus n);

    // sprechende Hilfsmethoden für eine "flüssigere" Verwendung in Tests
    default Nomen nominativus() {
        return casus(Categoriae.Casus.NOMINATIVUS);
    }

    default Nomen accusativus() {
        return casus(Categoriae.Casus.ACCUSATIVUS);
    }

    default Nomen pluralis() {
        return numerus(Categoriae.Numerus.PLURALIS);
    }
}
