package squarefy.src.pieces;

import java.awt.*;

public class Pawn extends Piece {

    public Pawn(Color color, char file, int rank){
        super(color, 1*(color == Color.WHITE ? 1 : -1), file, rank);
    }
}
