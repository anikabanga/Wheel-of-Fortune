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
        phrases = new ArrayList<Phrase>();
        phrases.add(new Phrase("et tu Brute"));
        phrases.add(new Phrase("My dear Watson"));
        phrases.add(new Phrase("I don't think we're in Kansas anymore"));
        phrases.add(new Phrase("You is kind. You is smart. You is important."));
        phrases.add(new Phrase("Anika is Queen"));
        phrases.add(new Phrase("Cup of Joe"));
        phrases.add(new Phrase("Feeling blue"));
        phrases.add(new Phrase("Bye Felicia"));
        phrases.add(new Phrase("Piece of Cake"));
        phrases.add(new Phrase("Plead the Fifth"));
        phrases.add(new Phrase("Spill the beans"));
        phrases.add(new Phrase("Barack Obama"));
        phrases.add(new Phrase("A Cheap Shot"));
        phrases.add(new Phrase("Choose Happiness"));
        phrases.add(new Phrase("All is Well"));
        phrases.add(new Phrase("Time will Tell"));
        phrases.add(new Phrase("Life is Short"));
        phrases.add(new Phrase("Rise up"));
        phrases.add(new Phrase("You'll be Back"));
        phrases.add(new Phrase("Somewhere over the rainbow"));
        phrases.add(new Phrase("The name's bond. james bond."));
        phrases.add(new Phrase("happy birthday"));
        phrases.add(new Phrase("the night is young"));
        phrases.add(new Phrase("tell them how i'm defying gravity"));
        phrases.add(new Phrase("get your head in the game"));
        phrases.add(new Phrase("this could be the start of something new"));
    }
    public Phrase randomPhrase()
    {
        return phrases.get((int) (Math.random()*phrases.size()));
    }


}
