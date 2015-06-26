package squarefy.src.pieces;

import java.awt.*;

public class Knight extends Piece {

    public Knight(Color color, char file, int rank){
        super(color, 3*(color == Color.WHITE ? 1 : -1), file, rank);
    }
}
