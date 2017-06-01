import java.awt.*;
import java.util.*;

/**
 * Represesents a rectangular game board, containing Piece objects.
 * @author Morgan Douglas
 * @version 4/16/17
 */
public class Board extends BoundedGrid<Letter>
{
    /**
     * constructs a board of dimension 8x8
     */
    public Board(int rows, int cols)
    {
        super(rows, cols);
    }
    /**
     * @Precondition:  move has already been made on the board
     * @Postcondition: piece has moved back to its source,
     * and any captured piece is returned to its location
     * @param move the Move being undone
     */
    public void undoMove(Move move)
    {
        
    }
    /**
     * @param move the Move which is to be executed
     * @postcondition piece has moved from source to destination of move
     */
    public void executeMove(Move move)
    {
    }
}
