package org.helldev.latin;

import java.util.Collection;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelperClass2PleaseRename {

    private final String sentence;

    public HelperClass2PleaseRename(String sentence){
        this.sentence = sentence;
    }
    
    public static Collection<String> disectSentence(String sentence){
        Pattern wordSeperatingRegex = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = wordSeperatingRegex.matcher(sentence);
        boolean gotStuff = matcher.matches(); //What is the actual difference between matcher.matches() and matcher.lookingAt()?
        return matcher.results().map(MatchResult::group).toList();
        
        
        
    }
    
    
}
