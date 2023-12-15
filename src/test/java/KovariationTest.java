import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KovariationTest {

    @Test
    void noArgs() {
        try {
            var cov = new Kovariation();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void oneArg() {
        var cov = new Kovariation(1l);
        assertEquals(1, cov.getNumbers().length);
    }

}