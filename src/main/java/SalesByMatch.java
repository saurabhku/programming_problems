import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> socksCountMap = new HashMap<>();
        ar.forEach( socks -> countSocks(socks, socksCountMap));

        return socksCountMap.values().stream().mapToInt(val -> val/2)
                        .sum();
    }

    static void countSocks(Integer socksNumber, Map<Integer, Integer> socksCountMap) {
        if (socksCountMap.containsKey(socksNumber)) {
            socksCountMap.put(socksNumber, socksCountMap.get(socksNumber)+1 );
        } else {
            socksCountMap.put(socksNumber, 1);
        }
    }

}

