import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {
    CountDiv countDiv = new CountDiv();

    @Test
    public void testSolution() {
        int A=6, B=11, K=2;
        int solution = countDiv.solution(A, B, K);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionforSingleValue() {
        int A=6, B=6, K=2;
        int solution = countDiv.solution(A, B, K);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionforNothingDivisible() {
        int A=19, B=25, K=17;
        int solution = countDiv.solution(A, B, K);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionforLargeInput() {
        int A=0, B=2000000000, K=1;
        long startTime = System.currentTimeMillis();
        int solution = countDiv.solution(A, B, K);
        System.out.println("time: "+(System.currentTimeMillis()-startTime));
        assertEquals(2000000001, solution);
    }
}
//A = 11, B = 345, K = 17
//got 19 expected 20

