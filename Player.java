/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private int balance;
    /**
     * Constructor for objects of class Player
     */
    public Player(String n)
    {
        name = n;
        balance = 0;
    }
    public int getAmt()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }
    public void setAmt(int x)
    {
        balance = x;
    }
}