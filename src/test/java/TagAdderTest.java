import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TagAdderTest {

    TagAdder tagAdder;

    @Before
    public void setUp() {
        tagAdder = new TagAdder();
    }

    @Test
    public void testSolution() {
        String instructions = "1,3,bold # 1,3,italic # 5,9,underline";
        String input = "Hello, How are you ?";
        String result = tagAdder.solution(instructions, input);
        assertEquals( "<b><i>He</b></i>ll<u>o, H</u>ow are you ?", result);
    }

    @Test
    public void testSolutionForEmptyInput() {
        String instructions = "1,3,bold # 1,3,italic # 5,9,underline";
        String input = "";
        String result = tagAdder.solution(instructions, input);
        assertEquals( "", result);
    }

    @Test
    public void testSolutionForEmptyInstructions() {
        String instructions = "";
        String input = "Hello, How are you ?";
        String result = tagAdder.solution(instructions, input);
        assertEquals( input, result);
    }

    @Test
    public void testSolutionForOverlappingInstructions() {
        String instructions = "1,21,body # 1,3,bold # 1,3,italic # 5,9,underline";
        String input = "Hello, How are you ?";
        String result = tagAdder.solution(instructions, input);
        assertEquals( "<body><b><i>He</b></i>ll<u>o, H</u>ow are you ?</body>", result);
    }

    @Test
    public void testSolutionForSingleCharacterInput() {
        String instructions = "1,2,body";
        String input = "H";
        String result = tagAdder.solution(instructions, input);
        assertEquals( "<body>H</body>", result);
    }

    @Test
    public void testSolutionForTwoCharacterInput() {
        String instructions = "1,2,body";
        String input = "He";
        String result = tagAdder.solution(instructions, input);
        assertEquals( "<body>H</body>e", result);
    }


    @After
    public void tearDown() {
        tagAdder = null;
    }
}
