import java.util.*;
/**
 * Write a description of class Phrase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phrase
{
    // instance variables - replace the example below with your own
    private ArrayList<Letter> letters;
    private String str;
    /**
     * Constructor for objects of class Phrase
     */
    public Phrase(String s)
    {
        str = s;
        letters = new ArrayList<Letter>();
        for(int i=0; i<s.length(); i++)
        {
            letters.add(new Letter(s.substring(i, i+1)));
        }
    }

    public String toString()
    {
        return str.toLowerCase();
    }
    public ArrayList<Letter> getLetters()
    {
        return letters;
    }
}
