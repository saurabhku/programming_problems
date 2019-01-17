/*


An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

        A[P] + A[Q] > A[R],
        A[Q] + A[R] > A[P],
        A[R] + A[P] > A[Q].

For example, consider array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20

Triplet (0, 2, 4) is triangular.

Write a function:

    int solution(int A[], int N);

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for
this array and returns 0 otherwise.

For example, given array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20

the function should return 1, as explained above. Given array A such that:
  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1


the function should return 0.
Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].


 */

public class Triangle {
    int solution(int A[] ) {
        if (A.length <3 ) {
            return 0;
        }
        A = mergeSort(A, 0, A.length - 1);
        long sum =0;
        for(int count=0; count<A.length; count++) {
            if (count+2 <= A.length-1) {
                if (A[count] + (long)A[count+1] > A[count+2] &&
                        A[count+1] + (long)A[count+2] > A[count] &&
                        A[count+2] + (long)A[count] > A[count+1]) {
                    return 1;
                }
            }
        }
        return 0;
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