import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurancesInArayTest {
    OddOccurancesInArray oddOccurancesInArray = new OddOccurancesInArray();

    @Test
    public void testSolution() {
        int[] input = { 9, 3, 9 , 3, 9, 7, 9};
        int result = oddOccurancesInArray.solution(input);
        assertEquals(7, result);
    }

    @Test
    public void testSolutionWhenElementOccurInMoreEvenPairs() {
        int[] input = { 9, 3, 3 , 3, 9, 7, 3};
        int result = oddOccurancesInArray.solution(input);
        assertEquals(7, result);
    }

    @Test
    public void testSolutionWhenElementOccurInMoreOddPairs() {
        int[] input = { 7, 3, 3 , 3, 7, 7, 3};
        int result = oddOccurancesInArray.solution(input);
        assertEquals(7, result);
    }
}
