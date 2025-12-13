package org.helldev.latin.playground.api;

/**
 * Allgemeine API für ein Latinisches Wort. Am Ende soll immer ".build()" aufgerufen werden
 * können um die konfigurierte Form ausgespielt zu bekommen.
 */
public interface Vocabulum {
    String build();
}
