import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
/**
 * @author Mykyta Shvets
 */
public class CaseTest {
    @Test
    public void shouldCreateImmutableInstance() {
        final Case _case = new Case(Case.Type.SOFT, 2);

        assertThat(_case.getType(), equalTo(Case.Type.SOFT));
        assertThat(_case.getPockets(), equalTo(2));
    }

}
