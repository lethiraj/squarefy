package squarefy.src.pieces;

import squarefy.src.board.Square;

import java.awt.*;
import java.util.ArrayList;

/**
 * A rook is valued at 5 points
 */

public class Rook extends Piece {

    public Rook(Color color, char file, int rank) {
        super(color, 5 * (color == Color.WHITE ? 1 : -1), file, rank);
        canMove = canCapture = false;
    }

    public String toString() {
        return (this.color == Color.WHITE ? "w" : "b") + "R";
    }

    @Override
    public ArrayList<Square> getMoves() {
        return moves;
    }

    @Override
    public boolean canMove() {
        return canMove;
    }

    @Override
    public boolean canCapture() {
        return canCapture;
    }
}
