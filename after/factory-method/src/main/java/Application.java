import java.security.SecureRandom;
import java.util.Random;

public class Application {
    private static final int BOARD_SIZE = 10;
    private static final int NUMBER_PLAYERS = 2;

    public static void main(String[] args) {
        PerpendicularGame game = new PerpendicularGame(BOARD_SIZE, NUMBER_PLAYERS);

        int nextPlayer = 0;

        Random random = new Random();
        while (true) {
            if (!game.move(nextPlayer, random.nextInt(4))) break;

            if (++nextPlayer > NUMBER_PLAYERS - 1)
                nextPlayer = 0;
        }
    }
}
