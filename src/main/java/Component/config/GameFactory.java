package Component.config;

import Component.ComputerPlayer;
import Component.Game;
import Component.Player;
import Component.UserPlayer;
import Component.console.ConsoleDataPrinter;
import Component.console.DataPrinter;

/**
 * @author mark
 */
public class GameFactory {

    public Game create() {

        var rangeNumber = "9";

        final DataPrinter printer = new ConsoleDataPrinter();
        final Player player = new UserPlayer(rangeNumber, printer);
        final Player computer = new ComputerPlayer(rangeNumber);

        return new Game(printer, player, computer);
    }
}
