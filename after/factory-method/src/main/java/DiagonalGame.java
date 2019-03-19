import java.util.Random;

public class DiagonalGame extends Game {
    public DiagonalGame(int boardSize, int numberPlayers) {
        super(boardSize, numberPlayers);
    }

    @Override
    protected Player createPlayer(Random random) {
        return new DiagonalPlayer(random.nextInt(boardSize), random.nextInt(boardSize));
    }
}
