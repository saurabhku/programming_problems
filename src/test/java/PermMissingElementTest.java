import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElementTest {
    PermMissingElement permMissingElement = new PermMissingElement();
    @Test
    public void testSolution() {
        int[] input = { 2, 3, 1, 5};
        int missingelement = permMissingElement.solution(input);
        assertEquals(4, missingelement);
    }

    @Test
    public void testSolutionWhenSingleElement() {
        int[] input = { 2 };
        int missingelement = permMissingElement.solution(input);
        assertEquals(1, missingelement);
    }

    @Test
    public void testSolutionWhenSingleElement_case2() {
        int[] input = { 1 };
        int missingelement = permMissingElement.solution(input);
        assertEquals(2, missingelement);
    }

    @Test
    public void testSolutionWhenNoElement() {
        int[] input = {  };
        int missingelement = permMissingElement.solution(input);
        assertEquals(1, missingelement);
    }

    @Test
    public void testSolutionWhenLongSequence() {
        int[] input = new int[99999];
        int val =2;
        for (int i=0;i < 99999; i++ ) {
            input[i] = val;
            val++;
        }
        System.out.println(input[99998]);

        int missingelement = permMissingElement.solution(input);
        assertEquals(1, missingelement);
    }
}
