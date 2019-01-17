import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    MergeSort mergeSort = new MergeSort();
    @Test
    public void testolution() {
        int[] input = new int[] { 3, 2, 4, 1};
        int[] solution = mergeSort.solution(input);

        assertEquals( 4, solution.length);
        assertEquals( 1, solution[0]);
        assertEquals( 2, solution[1]);
        assertEquals( 3, solution[2]);
        assertEquals( 4, solution[3]);
    }

    @Test
    public void testolution_case2() {
        int[] input = new int[] { 3, 2, 4, 1, 5};
        int[] solution = mergeSort.solution(input);

        assertEquals( 5, solution.length);
        assertEquals( 1, solution[0]);
        assertEquals( 2, solution[1]);
        assertEquals( 3, solution[2]);
        assertEquals( 4, solution[3]);
        assertEquals( 5, solution[4]);
    }

    @Test
    public void testolution_case3() {
        int[] input = new int[] { 3, 2, 4, 1, 5, 1};
        int[] solution = mergeSort.solution(input);

        assertEquals( 6, solution.length);
        assertEquals( 1, solution[0]);
        assertEquals( 1, solution[1]);
        assertEquals( 2, solution[2]);
        assertEquals( 3, solution[3]);
        assertEquals( 4, solution[4]);
        assertEquals( 5, solution[5]);
    }
}
