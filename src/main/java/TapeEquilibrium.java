/**
 * A non-empty array A consisting of N integers is given.
 * Array A represents numbers on a tape.
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts:
 * A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of:
 * |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first
 * part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * We can split this tape in four places:
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 * For example, given:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * the function should return 1, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */

public class TapeEquilibrium {
    public int solution(int[] A) {
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }
        int sum = sumElements(A);
        return calculateMinimumAbsoluteDiff(A, sum);
    }

    private int calculateMinimumAbsoluteDiff(int[] a, int sum) {
        int sumLeft=a[0];
        int sumRight=sum-a[0];
        int minimumDifference=Math.abs(sumLeft-sumRight);
        for ( int count =1; count< a.length-1; count++ ) {
            sumLeft = sumLeft+a[count];
            sumRight = sumRight-a[count];
            int difference = Math.abs(sumLeft -sumRight);
            if ( difference < minimumDifference)
                minimumDifference = difference;
        }
        return minimumDifference;
    }

    private int sumElements(int[] a) {
        int sum = 0;
        for (int element : a) {
            sum = sum + element;
        }
        return sum;
    }

}
