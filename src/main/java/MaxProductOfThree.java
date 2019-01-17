/*


A non-empty array A consisting of N integers is given.
The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6

contains the following example triplets:

        (0, 1, 2), product is −3 * 1 * 2 = −6
        (1, 2, 4), product is 1 * 2 * 5 = 10
        (2, 4, 5), product is 2 * 5 * 6 = 60

Your goal is to find the maximal product of any triplet.

Write a function:

    class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:
  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6

the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [3..100,000];
        each element of array A is an integer within the range [−1,000..1,000].


 */

import java.util.Arrays;
import java.util.Collections;

public class MaxProductOfThree {
    public int solution(int[] A) {
        A = mergeSort(A, 0, A.length - 1);
        int maxProduct = -1000000001;
        for(int count=0; count<A.length; count++) {
            if (count+2 <= A.length-1) {
                int product = A[count] * A[count+1] * A[count+2];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }

    private int[] mergeSort(int[] input, int start, int end) {
        if ( start == end) {
            return new int[] {input[start]};
        }
        int len = end -start +1;
        int mid = (start + end) /2;

        int[] left = new int[mid-start+1];
        int[] right = new int[end-mid];

        left=mergeSort(input, start, mid );
        right=mergeSort(input, mid+1, end);

        int leftCount =0;
        int rightCount =0;
        int count=0;
        int[] temp = new int[left.length+ right.length];
        while(true) {
            if( (leftCount >= left.length) || (rightCount >= right.length)) {
                break;
            }
            else if (left[leftCount] <= right[rightCount]) {
                temp[count] = left[leftCount];
                leftCount++;
                count++;
            }
            else if(right[rightCount] < left[leftCount]) {
                temp[count] = right[rightCount];
                rightCount++;
                count++;
            }
        }
        while ( leftCount < left.length) {
            temp[count] = left[leftCount];
            leftCount++;
            count++;
        }
        while ( rightCount < right.length) {
            temp[count] = right[rightCount];
            rightCount++;
            count++;
        }
        return temp;
    }
}
