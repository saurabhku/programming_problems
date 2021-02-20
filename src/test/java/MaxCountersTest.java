import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MaxCountersTest {
    MaxCounters maxCounters = new MaxCounters();

    @Test
    public void testSolution() {
        int[] A = {
                3, 4, 4, 6, 1, 4, 4
        };
        int N= 5;
        int[] result = maxCounters.solution(N, A);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals(3, result[0]);
        assertEquals(2, result[1]);
        assertEquals(2, result[2]);
        assertEquals(4, result[3]);
        assertEquals(2, result[4]);
    }

    @Test
    public void testSolutionWithMaxCounterAtEnd() {
        int[] A = {
                3, 4, 4, 6, 1, 4, 4, 6
        };
        int N= 5;
        int[] result = maxCounters.solution(N, A);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals(4, result[0]);
        assertEquals(4, result[1]);
        assertEquals(4, result[2]);
        assertEquals(4, result[3]);
        assertEquals(4, result[4]);
    }

    @Test
    public void testSolutionCase2() {
        int[] A = {
                3, 4, 4, 6, 1, 4, 4, 6, 1, 3, 1
        };
        int N= 5;
        int[] result = maxCounters.solution(N, A);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals(6, result[0]);
        assertEquals(4, result[1]);
        assertEquals(5, result[2]);
        assertEquals(4, result[3]);
        assertEquals(4, result[4]);
    }
    @Test
    public void testSolutionForOneElementAndOneOperation() {
        int[] A = {
                1
        };
        int N= 1;
        int[] result = maxCounters.solution(N, A);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }

    @Test
    public void testSolutionForOneElementAndOneOperationCase2() {
        int[] A = {
                2
        };
        int N= 1;
        int[] result = maxCounters.solution(N, A);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testSolutionOnlyMaxOperations() {
        int[] A = {
                6, 6, 6, 6, 6, 6, 6
        };
        int N= 5;
        int[] result = maxCounters.solution(N, A);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
        assertEquals(0, result[3]);
        assertEquals(0, result[4]);
    }
}
