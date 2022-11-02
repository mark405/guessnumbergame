package Component;

import Component.console.DataPrinter;

import java.util.Scanner;

/**
 * @author mark
 */
public class UserPlayer extends AbstractPlayer {

    DataPrinter printer;

    public UserPlayer(final String range, final DataPrinter printer) {
        super(range);
        this.printer = printer;
    }

    @Override
    public int getNumber() {

        while(true) {
            final String userNumber = new Scanner(System.in).nextLine();

            if (userNumber.compareTo("1") >= 0 && userNumber.compareTo(range) <= 0 ) {
                return Integer.parseInt(userNumber);
            }

            printer.printInfoMessage();
        }

    }
}
