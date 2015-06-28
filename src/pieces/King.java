package squarefy.src.pieces;

import java.awt.*;

public class King extends Piece {

    static final int KING_VALUE = 10_000_000;

    public King(Color color, char file, int rank){
        super(color, KING_VALUE*(color == Color.WHITE ? 1 : -1), file, rank);
    }
}
