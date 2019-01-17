import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPassingCars {
    PassingCars passingCars = new PassingCars();

    @Test
    public void testSolution() {
        int[] A = new int[] {0, 1, 0, 1, 1};
        int solution = passingCars.solution(A);
        assertEquals(5, solution);
    }

    @Test
    public void testSolutionCase2() {
        int[] A = new int[] {1, 0, 0, 1, 1};
        int solution = passingCars.solution(A);
        assertEquals(4, solution);
    }

    @Test
    public void ForSingleCar() {
        int[] A = new int[] {1};
        int solution = passingCars.solution(A);
        assertEquals(0, solution);
    }
}
