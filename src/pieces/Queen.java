package squarefy.src.pieces;

import squarefy.src.board.Square;

import java.awt.*;
import java.util.ArrayList;

/**
 * A queen is valued at 9 points
 */
public class Queen extends Piece {

    public Queen(Color color, char file, int rank) {
        super(color, 9 * (color == Color.WHITE ? 1 : -1), file, rank);
        canMove = canCapture = false;
    }

    public String toString() {
        return ((this.color == Color.WHITE) ? "w" : "b") + "Q";
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
