package squarefy.src.pieces;

import java.awt.*;

/**
 * A knight is valued at 3 points
 */
public class Knight extends Piece {

    public Knight(Color color, char file, int rank) {
        super(color, 3 * (color == Color.WHITE ? 1 : -1), file, rank);
    }

    public String toString() {
        return ((this.color == Color.WHITE) ? "w" : "b") + "N";
    }

    @Override
    public void move() {

    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public boolean canCapture() {
        return false;
    }
}
