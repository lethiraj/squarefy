package squarefy.src.pieces;

import squarefy.src.board.Square;

import java.awt.*;
import java.util.ArrayList;

/**
 * A pawn is valued at 1 point
 */
public class Pawn extends Piece {

    public Pawn(Color color, char file, int rank) {
        super(color, color == Color.WHITE ? 1 : -1, file, rank);
        int direction = (color == Color.WHITE) ? 1 : -1;
        canMove = true;
        canCapture = false;
        moves.add(board[transform(rank) + direction][transform(file)]);   //direction considers the direction
        moves.add(board[transform(rank) + 2*direction][transform(file)]); //of piece movement (forward/backward)
    }

    public String toString() {
        return ((this.color == Color.WHITE) ? "w" : "b") + "P";
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
