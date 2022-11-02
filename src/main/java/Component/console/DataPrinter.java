package Component.console;

/**
 * @author mark
 */
public interface DataPrinter {
    void printInfoMessage();

    void printMistakeMessage(int userNumber, char ch);


    void printFinalMessage();

    void printMoreMistakeMessage(int userNumber);

    void printLessMistakeMessage(int userNumber);
}
