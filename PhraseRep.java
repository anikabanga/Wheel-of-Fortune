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
    }
    public Phrase randomPhrase()
    {
        return phrases.get((int) (Math.random()*phrases.size()));
    }


}
