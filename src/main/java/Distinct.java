
/*



Write a function

    class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:
 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1

the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].


 */
public class Distinct {
    public int solution(int[] A) {
        int[] ints ;
        if (A.length > 0 ) {
            ints = mergeSort(A, 0, A.length - 1);
        } else
            ints = new int[] {};
        int distinct = ints.length>0 ? 1 : 0;
        for(int count=1; count<ints.length; count++) {
            if(ints[count] != ints[count-1]) {
                 distinct++;
            }
        }
        return distinct;
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
