package Component;

import Component.console.DataPrinter;

/**
 * @author mark
 */
public class Game {

    private final DataPrinter printer;

    private final Player player;

    private final Player computer;

    public Game(final DataPrinter printer, final Player player, final Player computer) {
        this.printer = printer;
        this.player = player;
        this.computer = computer;
    }

    public void play() {

        var computerNumber = computer.getNumber();

        while(true) {
            printer.printInfoMessage();

            var userNumber = player.getNumber();

            if (userNumber > computerNumber) {
                printer.printLessMistakeMessage(userNumber);
            } else if (userNumber < computerNumber) {
                printer.printMoreMistakeMessage(userNumber);
            } else if (userNumber == computerNumber) {
                printer.printFinalMessage();
                break;
            } else {
                throw new IllegalStateException("Method has been called in wrong time!");
            }
        }
    }

}
