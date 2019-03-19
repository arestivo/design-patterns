import java.util.Random;

public class PerpendicularGame extends Game{
    public PerpendicularGame(int boardSize, int numberPlayers) {
        super(boardSize, numberPlayers);
    }

    @Override
    protected Player createPlayer(Random random) {
        return new PerpendicularPlayer(random.nextInt(boardSize), random.nextInt(boardSize));
    }
}
