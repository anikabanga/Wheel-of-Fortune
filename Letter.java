
/**
 * Write a description of class Letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter
{
    // instance variables - replace the example below with your own
    private String hidden;
    private String revealed;
    private boolean state;
    private String let;
    /**
     * Constructor for objects of class Letter
     */
    public Letter(String letter)
    {
        let = letter.toLowerCase();
        hidden = new String("hidden.gif");
        revealed = new String(letter.toUpperCase() + ".gif");
        state = false;
    }

    public String getImageFileName()
    {
        if(state)
        {
            return revealed;
        }
        else
        {
            if(let.equals(" "))
                return "default";
            else
                return hidden;
        }
    }
    public String value()
    {
        return let;
    }
    public void reveal()
    {
        state = true;
    }
}
