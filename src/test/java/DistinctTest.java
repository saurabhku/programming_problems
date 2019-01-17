import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctTest {
    Distinct distinct = new Distinct();

    @Test
    public void testSolution() {
        int[] A = new int[] { 2, 1 ,1, 2, 3, 1};
        int solution = distinct.solution(A);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionForSingleValue() {
        int[] A = new int[] { 2};
        int solution = distinct.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForTwoDistinctValues() {
        int[] A = new int[] { 2, 1};
        int solution = distinct.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionForTwoSameValues() {
        int[] A = new int[] { 2, 2};
        int solution = distinct.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForEmptyInput() {
        int[] A = new int[] { };
        int solution = distinct.solution(A);
        assertEquals(0, solution);
    }
}
