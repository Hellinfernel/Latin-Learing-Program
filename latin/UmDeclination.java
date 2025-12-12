package latin;

/**
 * This Declination is for the words with a neutral Genus
 */

public class UmDeclination extends Noun{
    String[][] suffixes = new String[][] //TODO: IMPLEMENT SUFFIXES IN RIGHT ORDER
    public UmDeclination(String stem) {
        super(stem, Genus.NEUTRUM, suffixes);
    }
}
