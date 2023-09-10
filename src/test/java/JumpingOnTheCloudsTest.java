import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JumpingOnTheCloudsTest {

    JumpingOnTheClouds jumpingOnTheClouds;

    @Test
    public void testPositiveScenarios() {
        Integer[] c = {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0};

        int result = jumpingOnTheClouds.jumpingOnClouds(Arrays.asList(c));
        assertEquals(6, result);

    }
}
