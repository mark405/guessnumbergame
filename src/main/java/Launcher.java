import Component.ComputerPlayer;
import Component.Player;
import Component.UserPlayer;
import Component.console.ConsoleDataPrinter;
import Component.console.DataPrinter;

/**
 * @author mark
 */
public class Launcher {
    public static void main(String[] args) {


        Player player1 = new ComputerPlayer("9");
        Player player2 = new UserPlayer("9");
        DataPrinter printer = new ConsoleDataPrinter();

        var computerNumber = player1.getNumber();

        System.out.println(computerNumber);

        printer.printInfoMessage();

        while(true) {
            var userNumber = player2.getNumber();

            if (userNumber > computerNumber) {
                printer.printMistakeMessage(userNumber);
            } else if (userNumber < computerNumber) {
                printer.printMistakeMessage(userNumber);
            } else if (userNumber == computerNumber) {
                printer.printFinalMessage();
                break;
            } else {
                throw new IllegalStateException("Method has been called in wrong time!");
            }
        }

    }
}
