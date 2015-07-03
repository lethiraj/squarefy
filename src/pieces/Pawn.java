package squarefy.src.pieces;

import squarefy.src.board.Square;

import java.awt.*;
import java.util.ArrayList;

/**
 * A pawn is valued at 1 point
 */
public class Pawn extends Piece {

    int direction; // indicates the direction of movement (forward / backward)

    public Pawn(Color color, char file, int rank) {
        super(color, color == Color.WHITE ? 1 : -1, file, rank);
        direction= (color == Color.WHITE) ? 1 : -1;
        canMove = true;
        canCapture = false;
    }

    public String toString() {
        return ((this.color == Color.WHITE) ? "w" : "b") + "P";
    }

    @Override
    public ArrayList<Square> getMoves() {
        moves.add(board[_rank + direction][_file]);   //direction considers the direction
        moves.add(board[_rank + 2*direction][_file]); //of piece movement (forward/backward)
        validate(moves);
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

    @Override
    public void validate(ArrayList<Square> moves) {
        moves.add(board[transform(rank) + direction][transform(file)]);
        moves.add(board[transform(rank) + 2*direction][transform(file)]);

    }

}
