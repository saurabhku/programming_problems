import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquiLeaderTest {

    EquiLeader equiLeader;

    @Before
    public void setUp() {
        equiLeader = new EquiLeader();
    }

    @Test
    public void testSolution() {
        int[] A = { 4, 3, 4, 4, 4, 2} ;
        int solution = equiLeader.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionWithAllElementsSame() {
        int[] A = { 4, 4, 4} ;
        int solution = equiLeader.solution(A);
        assertEquals(3, solution);
    }

    @Test
    public void testSolutionForTwoElements() {
        int[] A = { 4, 4} ;
        int solution = equiLeader.solution(A);
        assertEquals(2, solution);
    }

    @Test
    public void testSolutionForSingleElement() {
        int[] A = { 4 } ;
        int solution = equiLeader.solution(A);
        assertEquals(1, solution);
    }

    @After
    public void tearDown() {
        equiLeader = null;
    }

}
