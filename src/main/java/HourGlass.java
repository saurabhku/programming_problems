/*
Given a 6*6 2D Array, arr:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical representation:
a b c
  d
e f g

There are  16 hourglasses in arr. An hourglass sum is the sum of an hourglass' values.
Calculate the hourglass sum for every hourglass in arr,
then print the maximum hourglass sum. The array will always be 6*6.

Example
arr=
-9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0

 The 16 hourglass sums are:

 -63, -34, -9, 12,
-10,   0, 28, 23,
-27, -11, -2, 10,
  9,  17, 25, 18
  The highest hourglass sum is 28 from the hourglass beginning at row 1, column 2

0 4 3
  1
8 6 6
 */

import java.util.List;
import java.util.stream.IntStream;

class HourGlass {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;
        int maxRows = arr.size();
        int maxCols = arr.get(0).size();

        return IntStream.range(0, maxRows - 2)
                .flatMap(row -> IntStream.range(0, maxCols - 2)
                        .mapToObj(col -> arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                                + arr.get(row + 1).get(col + 1)
                                + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2))
                .flatMapToInt(val -> IntStream.of(val)))
                .max()
                .orElse(Integer.MIN_VALUE);
    }
}
