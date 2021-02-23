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
        int smallestPostive=0;
        int maxPositive = 0;
        for (int number: A) { //Find maximum positive
            if (number> maxPositive) {
                maxPositive = number;
            }
        }
        if (maxPositive == 0) { // if all numbers are negative, just return 1
            return smallestPostive+1;
        }
        int[] data = new int[maxPositive]; //new array with all elements up to max number as indexes
        for (int element: A) {  // when you encounter a +ve number, mark it in the array
            if (element> 0)
                data[element-1] = 1;
        }
        for (int count=0; count<maxPositive;count++) {
            if (data[count] == 0) {  // find the unmarked smallest element
                smallestPostive = count+1;
                break;
            }
        }
    return smallestPostive==0?maxPositive+1:smallestPostive; //if nothing is marked return max positive +1
    }

}
