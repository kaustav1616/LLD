public abstract class Piece 
{
    Colour colour;
    Cell cell;

    public boolean abstract isMoveValid(Cell startCell, Cell endCell);

    public boolean move(Cell startCell, Cell endCell);
}