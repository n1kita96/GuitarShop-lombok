import lombok.val;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;

/**
 * @author Mykyta Shvets
 */
public class GuitarTest {
    @Test
    public void shouldExposeGuitarStateViaGetters() {
        final Guitar guitar = PopularGuitars.Fender;

        assertThat(guitar.getBrand(), equalTo("Fender"));
        assertThat(guitar.getModel(), equalTo("dg8s nat"));
        assertThat(guitar.getStrings(), equalTo(6));
        assertThat(guitar.getMaterials().keySet(), hasItems(Guitar.Wood.MAHOGANY, Guitar.Wood.BASSWOOD));
        assertThat(guitar.isClassic(), equalTo(false));
        assertThat(guitar.isDreadnought(), equalTo(true));
    }

    @Test
    public void shouldHaveWellBehavingEqualsAndHashCode() {
        val guitars = new HashSet<>(Arrays.asList(
                PopularGuitars.Fender,
                PopularGuitars.Gibson));

        assertThat(guitars.contains(PopularGuitars.newFender()), is(true));
        assertThat(guitars.contains(PopularGuitars.newIbanez()), is(false));
    }

    @Test
    public void shouldNotEqualIfAtLeastOneFieldIsDifferent() {
        val notExactCopyOfFender = new Guitar();
        notExactCopyOfFender.setBrand("Fender");
        notExactCopyOfFender.setModel("dg7s nat2");

        assertThat(notExactCopyOfFender.equals(PopularGuitars.Fender), is(false));
    }


    @Test
    public void shouldPrintItself() {
        val result = PopularGuitars.Fender.toString();

        System.out.println(result);

        assertThat(result, containsString("Fender"));
        assertThat(result, containsString("dg8s nat"));
        assertThat(result, containsString("6"));
    }

    @Test
    public void shouldBeClassicIfMadeFromCedarOrRosewoodAndHasNotTrussRod() {
        assertThat(PopularGuitars.Fender.isClassic(), is(false));
        assertThat(PopularGuitars.Gibson.isClassic(), is(false));
        assertThat(PopularGuitars.Ibanez.isClassic(), is(true));
    }

    @Test
    public void shouldBeDreadnoughtIfMadeFromMahoganyAndHasTrussRod() {
        assertThat(PopularGuitars.Fender.isDreadnought(), is(true));
        assertThat(PopularGuitars.Gibson.isDreadnought(), is(false));
        assertThat(PopularGuitars.Ibanez.isDreadnought(), is(false));
    }
}
