package Component;

import java.util.Random;

/**
 * @author mark
 */
public class ComputerPlayer extends AbstractPlayer {

    public ComputerPlayer(final String range) {
        super(range);
    }

    @Override
    public int getNumber() {
        int randomNumber = new Random().nextInt(Integer.parseInt(range) + 1);

        return randomNumber;
    }
}
