import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

/**
 * @author Mykyta Shvets
 */
public class PackedGuitarTest {
    @Test
    public void shouldContainGivenGuitarAndGivenPrice() {
        final PackedGuitar packedGuitar = PackedGuitar.with(PopularGuitars.Ibanez).price(999);

        assertThat(packedGuitar.guitar(), sameInstance(PopularGuitars.Ibanez));
        assertThat(packedGuitar.price(), is(999));
    }

    @Test(expected = NullPointerException.class)
    public void shouldNotBeCreatedIfGivenGuitarIsNull() {
        PackedGuitar.with(null);
    }
}
