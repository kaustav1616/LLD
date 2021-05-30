import java.util.List;
import java.util.Map;

public class Board 
{
    List<List<Cell>> cells;
    Map<Integer, Boolean> rowCheck;   
    Map<Integer, Boolean> colCheck; 
    Map<Diagonal, Boolean> diagCheck;

    public void resetBoard();
    
    public boolean isMoveValid(Cell startCell, Cell endCell);

    public void makeMove(Cell startCell, Cell endCell);

    public boolean isCheck(Cell cell, Piece piece);

    public boolean isCheckMate(Cell cell, Piece piece);

    public boolean isStaleMate(Cell cell, Piece piece);
}