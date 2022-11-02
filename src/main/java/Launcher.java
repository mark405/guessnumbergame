import Component.Game;
import Component.config.GameFactory;

/**
 * @author mark
 */
public class Launcher {
    public static void main(final String[] args) {

        GameFactory factory = new GameFactory();

        final Game game = factory.create();

        game.play();

    }
}
