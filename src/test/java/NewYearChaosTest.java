import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class NewYearChaosTest {
    NewYearChaos newYearChaos;
    @Test
    public void testPositiveScenarios() {
        Integer[] input =
                  {1,2,5,3,7,8,6,4};
//                   1 2 5 3 7 8 6 4
//                   1 2 5 3 7 8 4 6
//                   1 2 5 3 7 4 8 6
//                   1 2 5 3 7 4 6 8
//                   1 2 5 3 4 7 6 8
//                   1 2 5 3 4 6 7 8
//                   1 2 3 5 4 6 7 8
//                 1 2 3 4 5 6 7 8
//                 0 1 2 3 4 5 6 7


        newYearChaos.minimumBribes(Arrays.asList(input));
       // assertEquals(-6, result);
    }

    }
