import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {
    MissingInteger missingInteger = new MissingInteger();

    @Test
    public void testSolution() {
        int A[] = new int[] {1, 3, 6, 4, 1, 2};
        int solution = missingInteger.solution(A);
        assertEquals(5, solution);
    }

    @Test
    public void testSolutionCase2() {
        int A[] = new int[] {1, 2, 3};
        int solution = missingInteger.solution(A);
        assertEquals(4, solution);
    }

    @Test
    public void testSolutionForNegatives() {
        int A[] = new int[] { -1, -3 };
        int solution = missingInteger.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionCase3() {
        int A[] = new int[] {0, 1};
        int solution = missingInteger.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionForSingleNumber() {
        int A[] = new int[] {1};
        int solution = missingInteger.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionForSingleNegativeNumber() {
        int A[] = new int[] {-1};
        int solution = missingInteger.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForNegativesAnPositives() {
        int A[] = new int[] {-1, 0 , 1};
        int solution = missingInteger.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionForSinglePositiveElement() {
        int A[] = new int[] {3};
        int solution = missingInteger.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForMultiplePositiveElement() {
        int A[] = new int[] {3, 4, 5, 7};
        int solution = missingInteger.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionForExtremes() {
        int A[] = new int[] {-1000000, 1000000};
        int solution = missingInteger.solution(A);
        assertEquals(1, solution);
    }
}
