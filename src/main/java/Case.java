import lombok.Value;

/**
 * @author Mykyta Shvets
 */

@Value
public class Case {

    private final Type type;
    private final int pockets;

    public enum Type {HARD, SOFT}
}
