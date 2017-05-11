import java.util.*;
/**
 * Write a description of class PhraseRep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseRep
{
    private ArrayList<Phrase> phrases;
    /**
     * Constructor for objects of class PhraseRep
     */
    public PhraseRep()
    {
        phrases.add(new Phrase("et tu Brute"));
        phrases.add(new Phrase("My dear Watson"));
        phrases.add(new Phrase("I don't think we're in Kansas anymore"));
        phrases.add(new Phrase("You is kind. You is smart. You is important."));
        phrases.add(new Phrase("Gentlemen, you can't fight in here! This is the war room!"));
    }
    public Phrase randomPhrase()
    {
        return phrases.get((int) (Math.random()*phrases.size()));
    }


}
