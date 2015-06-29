package squarefy.src.pieces;

import java.awt.*;

/**
 * A bishop is valued at 3 points
 */
public class Bishop extends Piece {

    public Bishop(Color color, char file, int rank){
        super(color, 3*(color == Color.WHITE ? 1 : -1), file, rank);
    }

}
