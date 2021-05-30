import java.util.List;

public class Game
{
    Board board;
	Player player1;
    Player player2;
	Player currentPlayer;
    Player winner;
	List<Move> movesList;
	GameStatus gameStatus;

	public boolean move(Cell fromCell, Cell toCell);

	public boolean endGame();

	private void changeTurn();

    public boolean isCheck(Cell cell, Piece piece);

    public boolean isCheckMate(Cell cell, Piece piece);

    public boolean isStaleMate(Cell cell, Piece piece);
}