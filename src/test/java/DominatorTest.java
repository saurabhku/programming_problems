import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DominatorTest {

    Dominator dominator;
    @Before
    public void setUp() {
        dominator = new Dominator();

    }

    @Test
    public void testSolution() {
        int[] A= {3, 4, 3, 2, 3, -1, 3, 3};
        int solution = dominator.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionForNoDominator() {
        int[] A= {3, 4, 5, 2, 3, -1, 6, 3};
        int solution = dominator.solution(A);
        assertEquals(-1, solution);
    }

    @Test
    public void testSolutionForNoDominator_case2() {
        int[] A= {3, 3, 3, 3, 2, 2, 2, 2};
        int solution = dominator.solution(A);
        assertEquals(-1, solution);
    }

    @Test
    public void testSolutionForSingleElement() {
        int[] A= {3};
        int solution = dominator.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionForNoElement() {
        int[] A= {};
        int solution = dominator.solution(A);
        assertEquals(-1, solution);
    }

    @After
    public void tearDown() {
        dominator = null;

    }
}