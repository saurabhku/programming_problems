import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {

    MaxProfit maxProfit;

    @Before
    public void setUp() {
        maxProfit = new MaxProfit();
    }

    @Test
    public void testSolution() {
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        int solution = maxProfit.solution(A);
        assertEquals(356, solution);
    }
    @Test
    public void testSolution_case3() {
        int[] A = {8, 9, 3, 6, 1, 2};
        int solution = maxProfit.solution(A);
        assertEquals(3, solution);
    }

    @Test
    public void testSolution_case2() {
        int[] A = {12, 12, 13, 12, 12, 12};
        int solution = maxProfit.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForSingleElement() {
        int[] A = {23171};
        int solution = maxProfit.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionForEmptyArray() {
        int[] A = {};
        int solution = maxProfit.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionForSameElements() {
        int[] A = {12, 12, 12};
        int solution = maxProfit.solution(A);
        assertEquals(0, solution);
    }

    @After
    public void tearDown() {
        maxProfit = null;
    }
}
