import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class HourGlassTest {

    HourGlass hourGlass;

    @Test
    public void testPositiveScenarios() {
        int[][] input = {
                {-1, -1,  0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };

        List<List<Integer>> inputList = Arrays.stream(input).map(
                row -> Arrays.stream(row).boxed().collect(Collectors.toList())
                ).collect(Collectors.toList());

        int result = hourGlass.hourglassSum(inputList);
        assertEquals(-6, result);

    }
}
