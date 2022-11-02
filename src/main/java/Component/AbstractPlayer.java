package Component;

/**
 * @author mark
 */
public abstract class AbstractPlayer implements Player{
    protected String range;

    protected AbstractPlayer(final String range) {
        this.range = range;
    }
}
