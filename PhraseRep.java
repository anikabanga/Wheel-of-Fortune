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
        phrases.add(new Phrase("Anika is Queen"));
        phrases.add(new Phrase("Cup of Joe"));
        phrases.add(new Phrase("My dear Watson"));
        phrases.add(new Phrase("Feeling blue"));
        phrases.add(new Phrase("Bye Felicia"));
        phrases.add(new Phrase("Piece of Cake"));
        phrases.add(new Phrase("Plead the Fifth"));
        phrases.add(new Phrase("Spill the beans"));
        phrases.add(new Phrase("Cut the cheese"));
        phrases.add(new Phrase("Barack Obama"));
        phrases.add(new Phrase("A Cheap Shot"));
        phrases.add(new Phrase("Choose Happiness"));
        phrases.add(new Phrase("All is Well"));
        phrases.add(new Phrase("Time will Tell"));
        phrases.add(new Phrase("Life is Short"));
        phrases.add(new Phrase("Rise up"));
        phrases.add(new Phrase("Youll be Back"));
    }
    public Phrase randomPhrase()
    {
        return phrases.get((int) (Math.random()*phrases.size()));
    }


}
