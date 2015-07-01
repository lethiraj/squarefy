package squarefy.src.pieces;

import squarefy.src.rules.Playable;

import java.awt.*;

/**
 * An out-of-range square is indicated by (' ',0)
 * An invalid color is null
 */

public abstract class Piece implements Playable {

    private int value; // The value of the chess piece represented by any subclass of this class
    public Color color; // The color of the chess piece
    private int rank; // The row index of the piece
    private char file; // The column index of the piece

    public Piece(Color color, int value, char file, int rank){
        this.color = color;
        this.value = value;
        this.file = file;
        this.rank = rank;
    }

    public Color getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getFile() {
        return file;
    }


    public void setFile(char file) {
        if(file >= 'A' && file <= 'H') this.file = file; // Only allows the game to set valid files for pieces
        else this.file = ' '; // A blank space for file represents an out-of-range square
    }

    public void setColor(Color color) {
        if(color == Color.BLACK || color == Color.WHITE) this.color = color;
        else this.color = null; // null represents an invalid color
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if(rank >= 1 && rank <= 8) this.rank = rank; // Only allows the game to set valid ranks for the pieces
        else this.rank = 0; // 0 represents an out-of-range square
    }
}
