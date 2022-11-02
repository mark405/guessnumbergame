package Component.console;

/**
 * @author mark
 */
public class ConsoleDataPrinter implements DataPrinter{
    @Override
    public void printInfoMessage() {
        System.out.println("Please type a number between 0 and 9: ");
    }

    @Override
    public void printMistakeMessage(int userNumber) {
        System.out.println("number < " + userNumber + ". Try again:");
    }

    @Override
    public void printFinalMessage() {
        System.out.println("Congratulations, you guessed the number!");
    }
}
