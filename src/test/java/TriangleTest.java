import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void testSolution() {
        int[] A = { 10, 2, 5, 1, 8, 20 };
        int solution = triangle.solution(A);
        assertEquals(1, solution);
    }

    @Test
    public void testSolution_return0() {
        int[] A = { 10, 50, 5, 1 };
        int solution = triangle.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolution_ForSingleValue() {
        int[] A = { 10};
        int solution = triangle.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolution_ForTwoValues() {
        int[] A = { 10};
        int solution = triangle.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolution_ForFourEqualValues() {
        int[] A = { 10};
        int solution = triangle.solution(A);
        assertEquals(0, solution);
    }

    @Test
    public void testSolution_ForFourEmptyValues() {
        int[] A = { };
        int solution = triangle.solution(A);
        assertEquals(0, solution);
    }
}
