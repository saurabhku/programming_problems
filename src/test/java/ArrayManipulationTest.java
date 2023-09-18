import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayManipulationTest {
    ArrayManipulation arrayManipulation;
    @Test
    public void testArrayManipulation() {

        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1},
        };

        List<List<Integer>> listOfQueries = Arrays.stream(queries)
                .map((row) -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());

        arrayManipulation.arrayManipulation(10, listOfQueries);
        // assertEquals(-6, result);
    }

    @Test
    public void testArrayManipulationSce2() {

        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1},
        };

        List<List<Integer>> listOfQueries = Arrays.stream(queries)
                .map((row) -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());

        arrayManipulation.arrayManipulation(10000000, listOfQueries);
        // assertEquals(-6, result);
    }
}
