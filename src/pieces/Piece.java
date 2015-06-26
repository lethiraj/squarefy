package squarefy.src.pieces;

import squarefy.src.rules.Playable;

import java.awt.*;

public abstract class Piece implements Playable {

    public Piece(Color color, int value, char file, int rank){
        this.color = color;
        this.value = value;
        this.file = file;
        this.rank = rank;
    }

    private int value;
    private Color color;

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
        this.file = file;
    }

    public void setColour(Color color) {
        this.color = color;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private int rank;

    private char file;

}
