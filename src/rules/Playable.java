package squarefy.src.rules;

import squarefy.src.board.Square;

import java.awt.*;
import java.util.ArrayList;

public interface Playable {

    void setValue(int value);
    int getValue();
    void setColor(Color color);
    Color getColor();
    void setRank(int rank);
    int getRank();
    void setFile(char file);
    char getFile();
    ArrayList<Square> getMoves();
    boolean canMove();
    boolean canCapture();


}
