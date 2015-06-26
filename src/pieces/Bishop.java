package squarefy.src.pieces;

import squarefy.src.rules.ChessPiece;

public class Bishop implements ChessPiece {

    public Bishop(){
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getSide() {
        return side;
    }

    @Override
    public int getRank() {
        return 0;
    }

    @Override
    public char getFile() {
        return 0;
    }
}
