import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.extern.log4j.Log4j2;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mykyta Shvets
 */

@Builder
@Log4j2
public class Shop {

    @Getter
    private final LocalTime openTime;

    @Getter
    private final LocalTime closeTime;

    @Getter(AccessLevel.PACKAGE)
    @Singular
    private final List<String> sellers;

    @Getter(AccessLevel.PACKAGE)
    @Singular
    private final Map<String, PackedGuitar> guitars;

    public void recommendations() {
        Stream<Guitar> accoustics = guitars.values().stream()
                .map(PackedGuitar::guitar)
                .filter(Guitar::isDreadnought);
        LOGGER.error(accoustics.collect(Collectors.toList()));
    }
}
