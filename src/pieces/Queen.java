package squarefy.src.pieces;

import java.awt.*;

/**
 * A queen is valued at 9 points
 */
public class Queen extends Piece {

    public Queen(Color color, char file, int rank) {
        super(color, 9 * (color == Color.WHITE ? 1 : -1), file, rank);
    }

    public String toString() {
        return ((this.color == Color.WHITE) ? "w" : "b") + "Q";
    }


    @Override
    public void move() {

    }

    @Override
    public boolean canMove() {
        return false;
    }
}
