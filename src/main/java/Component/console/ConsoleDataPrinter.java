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
    public void printLessMistakeMessage(int userNumber) {
        printMistakeMessage(userNumber, '<');
    }

    public void printMistakeMessage(int userNumber, char ch) {
        System.out.println("Guessed number " + ch + " " + userNumber + ". Try again.");
    }

    public void printMoreMistakeMessage(int userNumber) {
        printMistakeMessage(userNumber, '>');
    }

    @Override
    public void printFinalMessage() {
        System.out.println("Congratulations, you guessed the number!");
    }
}
