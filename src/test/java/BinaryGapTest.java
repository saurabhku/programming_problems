import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    BinaryGap binaryGap;
    @Before
    public void setUp() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void testSolution() {
        int number = 51712;
        int solution = binaryGap.solution(number);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionWhenNoBinaryGap() {
        int number = 32;
        int solution = binaryGap.solution(number);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionWhenTwoBinaryGap() {
        int number = 529;
        int solution = binaryGap.solution(number);
        assertEquals(4, solution);
    }

    @Test
    public void testSolutionWhenTwoBinaryGapOfSameSize() {
        int number = 529;
        int solution = binaryGap.solution(number);
        assertEquals(4, solution);
    }


    @After
    public void tearDown() {
        binaryGap = null;
    }

}