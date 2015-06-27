package squarefy.src.pieces;

import squarefy.src.rules.Playable;

import java.awt.*;

public abstract class Piece implements Playable {

    private int value;
    private Color color;
    private int rank;
    private char file;

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
        if(file >= 'A' && file <= 'H') this.file = file;
        else this.file = ' ';
    }

    public void setColor(Color color) {
        if(color == Color.BLACK || color == Color.WHITE) this.color = color;
        else this.color = null;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if(rank >= 1 && rank <= 8) this.rank = rank;
        else this.rank = 0;
    }
}
