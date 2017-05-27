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
    // instance variables - replace the example below with your own
    Object[] possibilities = {2, 3};
    private ArrayList<Player> players;
    private Board board;
    private boolean won;
    private Frame f;
    private JOptionPane pane;
    private ArrayList<Letter> letters;
    private ArrayList<Letter> lettersCopy;
    private Phrase phrase;
    private BoardDisplay display;
    /**
     * Constructor for objects of class WheelofFortune
     */
    public WheelofFortune()
    {
        won=false;
        board = new Board(4, 12);
        players = new ArrayList<Player>();
        pane = new JOptionPane();
        f = new Frame();
        display = new BoardDisplay(board);

        Object input = pane.showInputDialog(f, "Select number of players", "New game", JOptionPane.PLAIN_MESSAGE, null, possibilities, 2);

        for(int i=0; i<((int)input); i++)
        {
            int z = i+1;
            Object name = pane.showInputDialog(f,"Player"+ z + "'s name" , null, JOptionPane.PLAIN_MESSAGE);
            players.add(new Player((String)name));
        }

        PhraseRep rep = new PhraseRep();
        phrase = rep.randomPhrase();
        System.out.println(phrase);
        letters = phrase.getLetters();
        lettersCopy = ((ArrayList<Letter>)letters.clone());
        int z=0;
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<12; j++)
            {
                if(z<letters.size())
                {
                    board.put(new Location(i, j), letters.get(z));
                    z++;
                }
            }
        }
        display.showBoard();
        play();
    }

    public void play()
    {
        while(!won)
        {
            for(int i=0; i<players.size(); i++)
            {
                if(!won)
                {
                    boolean tieSituation = false;
                    int money = ((int) (Math.random()*900));
                    Object guess = pane.showInputDialog(f, players.get(i).getName() + "'s guess" , null, JOptionPane.PLAIN_MESSAGE);
                    System.out.println(lettersCopy.size());
                    if(((String)guess).equals(phrase.toString()) || lettersCopy.size()==0)
                    {
                        Player winner = null;
                        won=true;
                        int max=0;
                        for(Player p : players)
                        {
                            if(p.getAmt()>max)
                                max=p.getAmt();
                        }
                        for(Player p : players)
                        {
                            if(p.getAmt() == max)
                                if(winner==null)
                                    winner=p;
                                else
                                    tieSituation = true;
                        }
                        if(!tieSituation)
                            pane.showMessageDialog(null, winner.getName()+"is winner");
                        else
                            pane.showMessageDialog(null, "TIE");
                    }	
                    else
                    {
                        int count = 0;
                        for(int m=0; m<letters.size(); m++)
                        {
                            if(letters.get(m).value().equals(((String)guess).toLowerCase()))
                            {
                                letters.get(m).reveal();
                                count++;
                            }
                        }
                        players.get(i).pay(money*count);
                        for(int k = lettersCopy.size()-1; k>=0; k--)
                        {
                            if(lettersCopy.get(k).value().equals(guess))
                            {
                                lettersCopy.remove(k);
                            }
                        }
                    }
                    display.showBoard();
                    try {Thread.sleep(500);} catch(InterruptedException e) {}
                }
            }
        }
    }
}
