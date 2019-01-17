import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenomicRangeQueryTest {
    GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void testSolution() {
        String input = "CAGCCTA";
        int[] P = new int[]{2, 5, 0};
        int[] Q = new int[]{4, 5, 6};

        int[] solution = genomicRangeQuery.solution(input, P, Q);
        assertEquals(P.length, solution.length);
        assertEquals(2, solution[0]);
        assertEquals(4, solution[1]);
        assertEquals(1, solution[2]);
    }

    @Test
    public void testSolutionForSingleNucleotide() {
        String input = "G";
        int[] P = new int[]{0};
        int[] Q = new int[]{0};

        int[] solution = genomicRangeQuery.solution(input, P, Q);
        assertEquals(P.length, solution.length);
        assertEquals(3, solution[0]);
    }

    @Test
    public void testSolutionForNucleotide_case2() {
        String input = "AC";
        int[] P = new int[]{0, 0, 1};
        int[] Q = new int[]{0, 1, 1 };

        int[] solution = genomicRangeQuery.solution(input, P, Q);
        assertEquals(P.length, solution.length);
        assertEquals(1, solution[0]);
        assertEquals(1, solution[1]);
        assertEquals(2, solution[2]);
    }
}
