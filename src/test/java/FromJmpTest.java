import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromJmpTest {
    FrogJmp frogJmp = new FrogJmp();

    @Test
    public void testSolution() {
        int solution = frogJmp.solution(10, 85, 30);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionWhenDistanceCompletelyDivisibleBySteps() {
        int solution = frogJmp.solution(10, 70, 30);
        assertEquals(2, solution);
    }
}
