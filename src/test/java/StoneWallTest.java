import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoneWallTest {

    StoneWall stoneWall;
    @Before
    public void setUp() {
        stoneWall = new StoneWall();
    }

    @Test
    public void testSolution() {
        int[] A = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int solution = stoneWall.solution(A);
        assertEquals(7, solution);
    }

    @Test
    public void testSolutionForOneBlock() {
        int[] A = {1};
        int solution = stoneWall.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForTwoBlockOfVariedLengths() {
        int[] A = {1, 2};
        int solution = stoneWall.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionForThreeBlockOfVariedLengths() {
        int[] A = {1, 3, 1};
        int solution = stoneWall.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionForThreeBlockOfVariedLengths_case2() {
        int[] A = {3, 1, 2};
        int solution = stoneWall.solution(A);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionForEmptyInput() {
        int[] A = {};
        int solution = stoneWall.solution(A);
        assertEquals(0, solution);
    }

    @After
    public void tearDown() {
        stoneWall = null;
    }
}

