import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

    RepeatedString repeatedString;

    @Test
    public void testPositiveScenarios() {

        long result = repeatedString.repeatedString("abcac", 10l);
        assertEquals(4, result);

    }
}
