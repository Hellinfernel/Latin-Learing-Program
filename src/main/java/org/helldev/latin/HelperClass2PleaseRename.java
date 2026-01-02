package org.helldev.latin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelperClass2PleaseRename {

    private final String sentence;
    public static final ArrayList<Word> lexicon = new ArrayList<>();

    public HelperClass2PleaseRename(String sentence){
        this.sentence = sentence;
    }
    
    public static Collection<String> disectSentence(String sentence){
        Pattern wordSeperatingRegex = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = wordSeperatingRegex.matcher(sentence);
        boolean gotStuff = matcher.matches(); //What is the actual difference between matcher.matches() and matcher.lookingAt()?
        return matcher.results().map(MatchResult::group).toList();
    }
    
    public static Word getWordFromLexicon(String word){
        Optional<String> optionalS = lexicon.stream()
                .flatMap(word1 -> word1.getAllForms().stream())
                .filter(word2 -> Objects.equals(word2, word))
                .findFirst();
        if (optionalS.isEmpty()){
            throw new RuntimeException("Word not found");
        } else if (optionalS.isPresent()) {
            return optionalS.get();
            
        }


    }
    
    
}
