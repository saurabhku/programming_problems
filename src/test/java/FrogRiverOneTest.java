import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {

    FrogRiverOne frogRiverOne = new FrogRiverOne();
    @Test
    public void testSolution() {
        int[] A = { 1,3,1,4,2,3,5,4};
        int X = 5;
        assertEquals(6, frogRiverOne.solution(X, A));
        }

    @Test
    public void testSolutionCase2() {
        int[] A = { 1,3,1,4,2,3,5,6,4};
        int X = 6;
        assertEquals(7, frogRiverOne.solution(X, A));
    }

    @Test
    public void testSolutionCaseWhenFrogIsNeverAbleToCross() {
        int[] A = { 3};
        int X = 5;
        assertEquals(-1, frogRiverOne.solution(X, A));
    }
    @Test
    public void testSolutionWhenFrogCanCrossInTheBegining() {
        int[] A = { 1, 1 };
        int X = 1;
        assertEquals(0, frogRiverOne.solution(X, A));
    }

    @Test
    public void testSolutionWhenFrogCanCrossInTheBeginingCase2() {
        int[] A = { 1};
        int X = 1;
        assertEquals(0, frogRiverOne.solution(X, A));
    }

    @Test
    public void testSolutionWhenFrogCanCrossAtTheEnd() {
        int[] A = { 1,3,1,4,2,3,4,5};
        int X = 5;
        assertEquals(7, frogRiverOne.solution(X, A));
    }
}



