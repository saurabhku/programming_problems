import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSwapsTest {

    MinimumSwaps minimumSwaps;
    @Test
    public void testPositiveScenarios() {
        int result = minimumSwaps.minimumSwaps(new int[] { 7, 1, 3, 2, 4, 5, 6});
        //int result = minimumSwaps.minimumSwaps(new int[] { 3, 2, 1});


        assertEquals(5, result);
    }
}
