import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSliceSumTest {

    MaxSliceSum maxSliceSum;

    @Before
    public void setUp() {
        maxSliceSum = new MaxSliceSum();
    }

    @Test
    public void testSolution() {
        int[] A = {3, 2, -6, 4, 0};
        int solution = maxSliceSum.solution(A);
        assertEquals(5, solution);
    }

    @Test
    public void testSolutionForSingleElement() {
        int[] A = {3};
        int solution = maxSliceSum.solution(A);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionForAllNegative() {
        int[] A = {-3, -2, -6, -1, -4};
        int solution = maxSliceSum.solution(A);
        assertEquals(-1, solution);
    }

    @After
    public void tearDown() {
        maxSliceSum = null;
    }
}