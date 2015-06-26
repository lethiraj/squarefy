package squarefy.src.rules;

public interface ChessPiece {

    int value = 0;
    int side = 0;
    int rank = 0;
    char file = 'Z';
    int getValue();
    int getSide();
    int getRank();
    char getFile();

}
