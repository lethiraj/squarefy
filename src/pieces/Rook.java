package squarefy.src.pieces;

import java.awt.*;

/**
 * A rook is valued at 5 points
 */
public class Rook extends Piece {

    public Rook(Color color, char file, int rank){
        super(color, 5*(color == Color.WHITE ? 1 : -1), file, rank);
    }
}
