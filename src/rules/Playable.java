package squarefy.src.rules;

import java.awt.*;

public interface Playable {

    void setValue(int value);
    int getValue();
    void setColor(Color color);
    Color getColor();
    void setRank(int rank);
    int getRank();
    void setFile(char file);
    char getFile();
    void move();
    boolean canMove();


}
