import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTapeEquilibrium {
    TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void testSolution() {
        int[] A = {3, 1, 2, 4, 3};
        assertEquals( 1, tapeEquilibrium.solution(A));
    }

    @Test
    public void testSolutionForPositiveDifference() {
        int[] A = {4, 3, 3, 1, 2};
        assertEquals( 1, tapeEquilibrium.solution(A));
    }

    @Test
    public void testSolutionForTwoElements() {
        int[] A = {3, 4};
        assertEquals( 1, tapeEquilibrium.solution(A));
    }

    @Test
    public void testSolutionForThreeElements() {
        int[] A = {3, 1, 1};
        assertEquals( 1, tapeEquilibrium.solution(A));
    }

    @Test
    public void testSolutionForTwoSameElements() {
        int[] A = {2, 2};
        assertEquals( 0, tapeEquilibrium.solution(A));
    }

    @Test
    public void testSolutionForAllNegatives() {
        int[] A = {-4, -3, -3, -1, -2};
        assertEquals( 1, tapeEquilibrium.solution(A));
    }

    @Test
    public void testSolutionForNegativesAndPositives() {
        int[] A = {-4, -3, 3, -1, 2};
        assertEquals( 5, tapeEquilibrium.solution(A));
    }
}
