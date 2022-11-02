package Component;

import java.util.Scanner;

/**
 * @author mark
 */
public class UserPlayer extends AbstractPlayer {

    public UserPlayer(final String range) {
        super(range);
    }

    @Override
    public int getNumber() {

        while(true) {
            final String userNumber = new Scanner(System.in).nextLine();

            if (userNumber.compareTo("1") >= 0 && userNumber.compareTo(range) <= 0 ) {
                return Integer.parseInt(userNumber);
            }

            System.out.println("Please type a number between 0 and 9: ");
        }

    }
}
