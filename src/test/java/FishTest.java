import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {
    Fish fish = new Fish();

    @Before
    public void setUp() {
        fish = new Fish();
    }

    @Test
    public void testSolution() {
        int[] A = { 4, 3, 2, 1, 5};
        int[] B = { 0, 1, 0, 0, 0};

        int solution = fish.solution(A, B);
        assertEquals(2, solution);
    }

    @Test
    public void testSolution_case2() {
        int[] A = { 4, 3, 2, 1, 5};
        int[] B = { 1, 0, 1, 1, 1};

        int solution = fish.solution(A, B);
        assertEquals(4, solution);
    }

    @Test
    public void testSolutionCase2() {
        int[] A = { 4, 3, 2, 1, 5};
        int[] B = { 1, 0, 0, 0, 0};


        int solution = fish.solution(A, B);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionCase3() {
        int[] A = { 4, 3, 8, 1, 5};
        int[] B = { 0, 0, 1, 0, 1};


        int solution = fish.solution(A, B);
        assertEquals(4, solution);
    }

    @Test
    public void testSolutionCase4() {
        int[] A = {4, 3, 8, 1, 5};
        int[] B = {1, 0, 1, 0, 1};


        int solution = fish.solution(A, B);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionCase5() {
        int[] A = { 4, 3, 8, 1, 10};
        int[] B = { 1, 0, 1, 0, 1};


        int solution = fish.solution(A, B);
        assertEquals(3 , solution);
    }
    @Test
    public void testSolutionWhenAllFishesUpstream() {
        int[] A = { 4, 3, 2, 1, 5};
        int[] B = { 0, 0, 0, 0, 0};

        int solution = fish.solution(A, B);
        assertEquals(5, solution);
    }

    @Test
    public void testSolutionWhenAllFishesDownstream() {
        int[] A = { 4, 3, 2, 1, 5};
        int[] B = { 1, 1, 1, 1, 1};

        int solution = fish.solution(A, B);
        assertEquals(5, solution);
    }

    @Test
    public void testSolutionWhenNoFishes() {
        int[] A = { };
        int[] B = { };

        int solution = fish.solution(A, B);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionWhenOneFishUpstream() {
        int[] A = { 3 };
        int[] B = { 1 };

        int solution = fish.solution(A, B);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionWhenOneFishDownstream() {
        int[] A = { 3 };
        int[] B = { 0 };

        int solution = fish.solution(A, B);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionWhenTwoFishDownstream() {
        int[] A = { 4, 3 };
        int[] B = { 1, 1 };

        int solution = fish.solution(A, B);
        assertEquals(2, solution);
    }



    @After
    public void tearDown() {
        fish = null;
    }
}
