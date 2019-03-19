import java.util.Random;

public abstract class Game {
    protected int boardSize;
    private boolean[][] board;

    private Player[] players;

    public Game(int boardSize, int numberPlayers) {
        this.boardSize = boardSize;

        this.board = new boolean[boardSize][boardSize];
        this.players = new Player[numberPlayers];

        Random random = new Random();
        for (int i = 0; i < boardSize; i++)
            for (int j = 0; j < boardSize; j++)
                this.board[i][j] = random.nextBoolean();

        for (int i = 0; i < numberPlayers; i++)
            players[i] = createPlayer(random);
    }

    protected abstract Player createPlayer(Random random);

    public boolean move(int playerNumber, int move) {
        players[playerNumber].move(move);

        int row = players[playerNumber].getRow();
        int column = players[playerNumber].getColumn();

        if (row < 0 || column < 0 || row > boardSize - 1 || column > boardSize - 1)
            return false;

        if (board[row][column]) {
            players[playerNumber].addPoint();
            board[row][column] = false;
        }

        System.out.println("Player #" + playerNumber + ": " + players[playerNumber]);

        return true;
    }
}
