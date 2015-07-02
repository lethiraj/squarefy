package squarefy.src.pieces;

import squarefy.src.board.Square;

import java.awt.*;
import java.util.ArrayList;

/**
 * A knight is valued at 3 points
 */
public class Knight extends Piece {

    public Knight(Color color, char file, int rank) {
        super(color, 3 * (color == Color.WHITE ? 1 : -1), file, rank);
        canMove = true;
        canCapture = false;
        moves.add(board[transform(rank) + 2][transform(file) - 1]);
        moves.add(board[transform(rank) + 2][transform(file) + 1]);

    }

    public String toString() {
        return ((this.color == Color.WHITE) ? "w" : "b") + "N";
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
