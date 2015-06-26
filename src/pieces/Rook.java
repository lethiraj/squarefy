package squarefy.src.pieces;

import java.awt.*;

public class Rook extends Piece {

    public Rook(Color color, char file, int rank){
        super(color, 5*(color == Color.WHITE ? 1 : -1), file, rank);
    }
}
