import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LeftRotationTest {
    LeftRotation leftRotation;

    @Test
    public void testPositiveScenarios() {

        Integer[] ar = {33,47,70,37,8,53,13,93,71,72,51,100,60,87,97};

        List<Integer> result = leftRotation.rotLeft(Arrays.asList(ar), 13);
        assertEquals(result.size(), ar.length);
//        assertEquals(5, result.get(0).intValue());
//        assertEquals(1, result.get(1).intValue());
//        assertEquals(2, result.get(2).intValue());
//        assertEquals(3, result.get(3).intValue());
//        assertEquals(4, result.get(4).intValue());
    }
}
