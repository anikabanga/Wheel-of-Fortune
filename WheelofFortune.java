import java.util.*;
import javax.swing.JOptionPane;
import java.awt.Frame;
/**
 * Write a description of class WheelofFortune here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WheelofFortune
{
    Integer[] possibilities = {2, 3};
    private ArrayList<Player> players;
    /**
     * Constructor for objects of class WheelofFortune
     */
    public WheelofFortune()
    {
        players = new ArrayList<Player>();
        PhraseRep prep = new PhraseRep();
        Phrase p = prep.randomPhrase();
        JOptionPane pane = new JOptionPane();
        Frame f = new Frame();
        Object input = pane.showInputDialog(f, "Select number of players", "New game", JOptionPane.PLAIN_MESSAGE, 
                                            null, possibilities, 2);
        for(int i=0; i<((int)input); i++)
        {
            int z = i+1;
            Object name = pane.showInputDialog(f,"Player"+ z + "'s name" , null, JOptionPane.PLAIN_MESSAGE);
            players.add(new Player((String)name));
        }
        
    }
}
