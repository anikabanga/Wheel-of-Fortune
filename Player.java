
/**
 * Player for Wheel of Fortune game
 * 
 * @author Morgan Douglas, Anika Banga, Julia Huang
 * @version June 1, 2017
 */
public class Player
{
    //instance variables
    private String name;
    private int balance;
    
    /**
     * Constructor for objects of class Player
     *@param    n   name
     */
    public Player(String n)
    {
        name = n;
        balance = 0;
    }
    //@return   the balance
    public int getAmt()
    {
        return balance;
    }
    //@return   the name of the player
    public String getName()
    {
        return name;
    }
    //@param    the new balance
    public void setAmt(int x)
    {
        balance = x;
    }
    //@param the amount of money the player is making
    public void pay(int x)
    {
        balance+=x;
    }
}
