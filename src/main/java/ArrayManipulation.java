/*
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value
        to each the array element between two given indices, inclusive.
        Once all operations have been performed, return the maximum value in the array.
Example
n = 10
queries = [ [1, 5, 3], [4, 8, 7], [6, 9, 1]]

Queries are interpreted as follows:
    a b k
    1 5 3
    4 8 7
    6 9 1

Add the values of k between the indices a and b inclusive:
index->	 1 2 3  4  5 6 7 8 9 10
	    [0,0,0, 0, 0,0,0,0,0, 0]
	    [3,3,3, 3, 3,0,0,0,0, 0]
	    [3,3,3,10,10,7,7,7,0, 0]
	    [3,3,3,10,10,8,8,8,1, 0]

The largest value is 10 after all operations are performed.
*/

import java.util.List;

public class ArrayManipulation {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long maximumValue = 0;
        int[] result = new int[n+1];

        for (List<Integer> query: queries) {
            int start = query.get(0);
            int end = query.get(1);
            int numberToAdd = query.get(2);

            result[start-1] = result[start-1] +numberToAdd;
            result[end] = result[end ]-numberToAdd;
        }
        int temp =0;
        for ( int val: result) {
            temp += val;
            if (temp > maximumValue) {
                maximumValue = temp;
            }
        }
        return maximumValue;
    }
}