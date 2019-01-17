import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductOfThreeTest {
    MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    public void testSolution() {
        int[] input = new int[] {  -3, 1, 2, -2, 5, 6 };
        int solution = maxProductOfThree.solution(input);
        assertEquals(60, solution);
    }

    @Test
    public void testSolution_case2() {
        int[] input = new int[] {  -5, 5, -5, 4 };
        int solution = maxProductOfThree.solution(input);
        assertEquals(125, solution);
    }
    @Test
    public void testSolutionForOnlyNegative() {
        int[] input = new int[] {  -3, -1, -2, -2, -5, -6 };
        int solution = maxProductOfThree.solution(input);
        assertEquals(-4, solution);
    }

    @Test
    public void testSolutionFor3Elements() {
        int[] input = new int[] {  -3, 1, 2 };
        int solution = maxProductOfThree.solution(input);
        assertEquals(-6, solution);
    }

    @Test
    public void testSolutionFor3Elements_case2() {
        int[] input = new int[] {  -1000, -1000, -1000 };
        int solution = maxProductOfThree.solution(input);
        assertEquals(-1000000000, solution);
    }

}
