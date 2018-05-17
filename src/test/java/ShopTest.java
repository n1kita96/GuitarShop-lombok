import org.junit.Test;

import java.time.LocalTime;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
/**
 * @author Mykyta Shvets
 */
public class ShopTest {
    @Test
    public void shouldBuildShop() {
        final Shop shop = Shop.builder()
                .openTime(LocalTime.of(18, 0))
                .closeTime(LocalTime.of(23, 0))
                .seller("James")
                .seller("John")
                .guitar("gibson", PackedGuitar.with(PopularGuitars.Gibson))
                .guitar("fender", PackedGuitar.with(PopularGuitars.Fender))
                .build();

        assertThat(shop.getOpenTime(), equalTo(LocalTime.of(9, 0)));
        assertThat(shop.getCloseTime(), equalTo(LocalTime.of(18, 0)));
        assertThat(shop.getSellers(), hasItems("James", "John"));
        assertThat(shop.getGuitars().get("gibson").guitar(), sameInstance(PopularGuitars.Gibson));
        assertThat(shop.getGuitars().get("fender").guitar(), sameInstance(PopularGuitars.Fender));

        shop.recommendations();
    }
}
