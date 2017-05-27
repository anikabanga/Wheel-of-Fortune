import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Used to display the contents of a game board
public class BoardDisplay implements ActionListener
{
    private Board board;
    private JButton[][] grid;
    private Move selectedMove;
    private JFrame frame;
    private Color[][] colors;

    // Constructs a new display for displaying the given board
    public BoardDisplay(Board board)
    {
        this.board = board;
        grid = new JButton[board.getNumRows()][board.getNumCols()];
        colors = new Color[board.getNumRows()][board.getNumCols()];

        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    createAndShowGUI();
                }
            });

        //Wait until display has been drawn
        try
        {
            while (frame == null || !frame.isVisible())
                Thread.sleep(1);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private void createAndShowGUI()
    {
        //Create and set up the window.
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(board.getNumRows(), board.getNumCols()));

        //Create each square as a button.
        for (int row = 0; row < grid.length; row++)
            for (int col = 0; col < grid[row].length; col++)
            {
                grid[row][col] = new JButton();
                grid[row][col].setOpaque(true);
                if(row==0)
                    grid[row][col].setBackground(new Color(100, 160, 115));
                    else if(row==1)
                    grid[row][col].setBackground(new Color(125, 200, 170));
                    else if(row==2)
                    grid[row][col].setBackground(new Color(150, 240, 210));
                grid[row][col].setPreferredSize(new Dimension(100, 100));
                grid[row][col].setActionCommand(row + "," + col);
                grid[row][col].addActionListener(this);
                frame.getContentPane().add(grid[row][col]);
            }

        //Show the pieces
        showBoard();

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //Called when a square is clicked.
    public void actionPerformed(ActionEvent event)
    {
        //Determine location of clicked button.
        String command = event.getActionCommand();
        int comma = command.indexOf(",");
        int row = Integer.parseInt(command.substring(0, comma));
        int col = Integer.parseInt(command.substring(comma + 1));
        Location loc = new Location(row, col);

    }

    //Redraws the board to include the pieces and border colors.
    public void showBoard()
    {
		for (int row = 0; row < grid.length; row++)
			for (int col = 0; col < grid[row].length; col++)
			{
				Location loc = new Location(row, col);

				Letter letter = board.get(loc);

				Icon icon = null;
				if (letter != null)
				{
					//System.out.println(loc);
					String s = letter.getImageFileName();
					if(s.equals("default"))
					{}
					else
					   icon = new ImageIcon(s);
				}
				grid[row][col].setIcon(icon);

				Color color = colors[row][col];

				if (color == null)
					grid[row][col].setBorder(null);
				else
					grid[row][col].setBorder(BorderFactory.createLineBorder(color));
			}
    }

    // Waits for the user to select a move and returns this move.
    public Move selectMove()
    {
        return null;
    }

    // Sets the title of the window.
    public void setTitle(String title)
    {
        frame.setTitle(title);
    }

    // Sets the color of the border for the given location, and redraws it.
    public void setColor(Location loc, Color color)
    {
        colors[loc.getRow()][loc.getCol()] = color;
        showBoard();
    }

    // Clears all border colors and redraws the board.
    public void clearColors()
    {
        for (int row = 0; row < colors.length; row++)
            for (int col = 0; col < colors[row].length; col++)
                colors[row][col] = null;
        showBoard();
    }

    public void reveal()
    {
    }
}
