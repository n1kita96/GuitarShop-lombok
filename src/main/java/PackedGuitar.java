import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author Mykyta Shvets
 */

@RequiredArgsConstructor(staticName = "with")
@Accessors(fluent = true)
public class PackedGuitar {

    @Getter
    @NonNull
    private final Guitar guitar;

    @Getter
    @Setter
    private double price;
}
