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
    }

    public String toString() {
        return ((this.color == Color.WHITE) ? "w" : "b") + "N";
    }

    @Override
    public ArrayList<Square> getMoves() {
        for(int i = 2; i >= -2; i = i - 1){
            moves.add(board[_rank + i][_file - 1]);
            moves.add(board[_rank + i][_file + 1]);
        }
        validate(moves);
        return moves;
    }

    @Override
    public boolean canMove() {
        return !moves.isEmpty();
    }

    @Override
    public boolean canCapture() {
        return canCapture;
    }

    @Override
    public void validate(ArrayList<Square> moves) {

    }


}
