package org.helldev.latin.playground.api;

/**
 * API für Verben die definiert, welche Informationen (Categoriae) zum
 * "konfigurieren" eines Adjektives benötigt werden.
 * <p>
 * Konjugation ist zum beispiel Teil der Implementierung von Verbum, nicht des Interfaces.
 */
public interface Verbum extends Vocabulum {

    // hier kommen alle Typen die konfiguriert werden können.
    Verbum persona(Categoriae.Persona p);

    Verbum numerus(Categoriae.Numerus n);

    Verbum tempus(Categoriae.Tempus t);

    Verbum modus(Categoriae.Modus m);

    Verbum vox(Categoriae.Vox v);

    // sprechende Hilfsmethoden für eine "flüssigere" Verwendung in Tests
    default Verbum praesens() {
        return tempus(Categoriae.Tempus.PRAESENS);
    }

    default Verbum activa() {
        return vox(Categoriae.Vox.ACTIVA);
    }

    default Verbum tertiaPersona() {
        return persona(Categoriae.Persona.TERTIA);
    }
}
