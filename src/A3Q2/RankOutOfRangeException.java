package A3Q2;

/**
 *
 * @author jameselder
 */
public class RankOutOfRangeException extends Exception {

    /**
     * Creates a new instance of <code>RankOutOfRangeException</code> without detail message.
     */
    public RankOutOfRangeException() {
    }


    /**
     * Constructs an instance of <code>RankOutOfRangeException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public RankOutOfRangeException(String msg) {
        super(msg);
    }
}