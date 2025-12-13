package org.helldev.latin.playground.api;

/**
 * Alle grammatikalischen Typen an einer Stelle, lateinisch "Categoriae"
 */
public interface Categoriae {
    enum Casus {NOMINATIVUS, GENITIVUS, DATIVUS, ACCUSATIVUS, ABLATIVUS, VOCATIVUS}

    enum Numerus {SINGULARIS, PLURALIS}

    enum Genus {MASCULINUM, FEMININUM, NEUTRUM}

    enum Persona {PRIMA, SECUNDA, TERTIA}

    enum Tempus {PRAESENS, IMPERFECTUM, FUTURUM, PERFECTUM, PLUSQUAMPERFECTUM, FUTURUM_PERFECTUM}

    enum Modus {INDICATIVUS, CONIUNCTIVUS, IMPERATIVUS, INFINITIVUS}

    enum Vox {ACTIVA, PASSIVA}
}
