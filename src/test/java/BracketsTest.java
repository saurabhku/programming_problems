import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracketsTest {

    Brackets brackets;

    @Before
    public void setUp() {
        brackets = new Brackets();
    }

    @Test
    public void testSolution() {
        String input = "{[()()]}";
        int solution = brackets.solution(input);
        assertEquals(1, solution);
    }

    @Test
    public void testSolutionFOrInvalidString() {
        String input = "{[()(]}";
        int solution = brackets.solution(input);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionFOrInvalidString_case2() {
        String input = ")[()(]}";
        int solution = brackets.solution(input);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionFOrInvalidString_case3() {
        String input = "(()";
        int solution = brackets.solution(input);
        assertEquals(0, solution);
    }

    @Test
    public void testSolutionFOrInvalidString_case4() {
        String input = "(";
        int solution = brackets.solution(input);
        assertEquals(0, solution);
    }

    @After
    public void tearDown() {
        brackets =null;
    }
}
