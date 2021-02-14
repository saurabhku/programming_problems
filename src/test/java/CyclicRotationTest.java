import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CyclicRotationTest {
    CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void testSolution() {
        int[] A = { 3, 8, 9, 7, 6};
        int count =3;

        int[] result = cyclicRotation.solution(A, count);
        assertNotNull( result);
        assertEquals(5, result.length);
        assertEquals( 9, result[0]);
        assertEquals( 7, result[1]);
        assertEquals( 6, result[2]);
        assertEquals( 3, result[3]);
        assertEquals( 8, result[4]);
    }

    @Test
    public void testSolution_2() {
        int[] A = { 0, 0, 0};
        int count =1;

        int[] result = cyclicRotation.solution(A, count);
        assertNotNull( result);
        assertEquals(3, result.length);
        assertEquals( 0, result[0]);
        assertEquals( 0, result[1]);
        assertEquals( 0, result[2]);
    }

    @Test
    public void testSolution_3() {
        int[] A = { 1, 2, 3, 4};
        int count =4;

        int[] result = cyclicRotation.solution(A, count);
        assertNotNull( result);
        assertEquals(4, result.length);
        assertEquals( 1, result[0]);
        assertEquals( 2, result[1]);
        assertEquals( 3, result[2]);
        assertEquals( 4, result[3]);

    }
}
