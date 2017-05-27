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
        phrases.add(new Phrase("My dear Watson"));
        phrases.add(new Phrase("Chase a check"));
        phrases.add(new Phrase("The Odyssey"));
        phrases.add(new Phrase("Salsa tequila corazon"));
        phrases.add(new Phrase("I love Ms. Datar"));
        phrases.add(new Phrase("AP CS DS rocks"));
        phrases.add(new Phrase("Don't memorize triangles"));
        phrases.add(new Phrase("Samuel Lepler"));
        phrases.add(new Phrase("Anu Datar"));
        phrases.add(new Phrase("Anika Banga"));
        phrases.add(new Phrase("Julia Huang"));
        phrases.add(new Phrase("Morgan Douglas"));
        phrases.add(new Phrase("Cantilena is amazing"));
        phrases.add(new Phrase("Join tutoring club!"));
    }
    public Phrase randomPhrase()
    {
        return phrases.get((int) (Math.random()*phrases.size()));
    }


}
