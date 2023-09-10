import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalesByMatchTest {

    SalesByMatch salesByMatch;

    @Test
    public void testSalesByMatchSuccess( ) {
        int n= 7;
        List<Integer> ar  = Arrays.asList( 1,2,1,2,1,3,2);
        int result = salesByMatch.sockMerchant(n, ar);
        assertEquals(2, result);

    }
}
