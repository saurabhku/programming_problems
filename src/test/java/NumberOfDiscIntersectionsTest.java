import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest {
    NumberOfDiscIntersections numberOfDiscIntersections;
    @Before
    public void setUp() {
        numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    public void testSolutionForTwoCircles() {
        int A[] = new int[] {
                1, 5
        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForTwoCircles_case_2() {
        int A[] = new int[] {
                5, 1
        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolution() {
        int A[] = new int[] {
            1, 5, 2, 1, 4, 0
        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(11, solution);
    }

    @Test
    public void testSolutionForOneDisc() {
        int A[] = new int[] {
           1
        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(0, solution);
    }


    @Test
    public void testSolutionForZeroDisc() {
        int A[] = new int[] {

        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolution_case4() {
        int A[] = new int[] {
                1, 0, 0, 1, 0, 0
        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionForNonIntersectingDisc() {
        int A[] = new int[] {
                0, 0, 0, 0, 0, 0
        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionForAllIntersectingDisc() {
        int A[] = new int[] {
                5, 0, 0, 1, 0, 0
        };
        int solution = numberOfDiscIntersections.solution(A);
        assertEquals(7, solution);
    }

    @After
    public void tearDown() {
        numberOfDiscIntersections=null;
    }
}
