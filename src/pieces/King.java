package squarefy.src.pieces;

import java.awt.*;

/**
 * A king is infinitely valuable
 */

public class King extends Piece {

    static final int KING_VALUE = 10_000_000;

    public King(Color color, char file, int rank) {
        super(color, KING_VALUE * (color == Color.WHITE ? 1 : -1), file, rank);
        canCapture = canMove = false;
    }

    public String toString() {

        return ((this.color == Color.WHITE) ? "w" : "b") + "K";
    }

    @Override
    public void move() {

    }

    @Override
    public boolean canMove() {
        return canMove;
    }

    public boolean canCapture(){
        return canCapture;
    }
}
