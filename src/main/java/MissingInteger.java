/*



This is a demo task.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer
(greater than 0) that does not occur in A.


For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].


 */

public class MissingInteger {

    int solution(int A[]) {
        int minimum = 1000001;
        int maximum = -1000001;
        for (int count=0; count < A.length; count++) {
            if (A[count] < minimum) {
                minimum = A[count];
            }
            if (A[count] > maximum) {
                maximum = A[count];
            }
        }
        int sizeOfNewArray = maximum-minimum+1;
        int[] countArray = new int[sizeOfNewArray];
        for (int count=0; count < A.length; count++ ) {
            if (minimum <= 0) {
                countArray[A[count]-minimum] = countArray[A[count]-minimum]+1;
            } else {
                countArray[A[count]-minimum] = countArray[A[count]-minimum]+1;
            }
        }
        int minimumPositive = maximum+1;
        if (minimum <= 0) {
            for(int count=0; count< countArray.length;count++) {
                if (countArray[count] == 0) {
                    int element = minimum+count;
                    if( element > 0 && element < minimumPositive) {
                        minimumPositive = element;
                    }
                }
            }
        } else {
            for(int count=0; count< countArray.length;count++) {
                if (countArray[count] == 0) {
                    int element = count + minimum;
                    if( element < minimumPositive) {
                        minimumPositive = element;
                    }
                }
            }
        }

        if(( minimumPositive <= 0) && (maximum <=0))
            return 1;
        else if(minimum >=2)
            return 1;
        else if(( minimumPositive <= 0) && (maximum >0))
            return maximum+1;

        else
            return minimumPositive;
    }

}
