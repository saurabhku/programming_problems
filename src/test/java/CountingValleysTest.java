
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CountingValleysTest {

    CountingValleys countingValleys;

    @Test
    public void testPositiveScenarios( ) {
        int n= 8;
        String path= "UDDDUDUU";
        int result = countingValleys.count(n, path);
        assertEquals(1, result);

    }
}
