package squarefy.src.pieces;

import java.awt.*;

/**
 * A pawn is valued at 1 point
 */
public class Pawn extends Piece {

    public Pawn(Color color, char file, int rank){
        super(color, color == Color.WHITE ? 1 : -1, file, rank);
    }
}
