import java.util.Stack;

/*


A non-empty array A consisting of N integers is given.

The leader of this array is the value that occurs in more than half of the elements of A.

An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S]
and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.

For example, given array A such that:
    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2

we can find two equi leaders:

        0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
        2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.

The goal is to count the number of equi leaders.

Write a function:

    int solution(int A[], int N);

that, given a non-empty array A consisting of N integers, returns the number of equi leaders.

For example, given:
    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2

the function should return 2, as explained above.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].


 */
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class EquiLeader {
    int solution(int A[]) {
        int equiLeaderCount = 0;
        int leader;
        try {
            leader = findEquiLeader(A, 0, A.length - 1);
        } catch (NoLeaderException e) {
            return 0;
        }

        int leaderCount = 0;
        for (int count = 0; count < A.length; count++) {
            if (A[count] == leader) {
                leaderCount++;
            }
        }
        int leaderCountInLeft = 0;
        for (int count = 0; count < A.length; count++) {
            boolean validLeft, validRight = false;

            if (A[count] == leader) {
                leaderCountInLeft++;
            }
            int numberOfElementsInLeft = count + 1;
            if (numberOfElementsInLeft == 1 && leaderCountInLeft == 1) {
                validLeft = true;
            } else if (leaderCountInLeft > numberOfElementsInLeft / 2) {
                validLeft = true;
            } else {
                validLeft = false;
            }
            int leaderCountInRight = leaderCount - leaderCountInLeft;
            int numberOfElementsInRight = A.length - 1 - count;
            if (leaderCountInRight > numberOfElementsInRight / 2) {
                validRight = true;
            }

            if (validLeft && validRight) {
                equiLeaderCount++;
            }

        }
        return equiLeaderCount;
    }

    int findEquiLeader(int[] A, int startIndex, int endIndex) throws NoLeaderException {
        Stack<Integer> intStack = new Stack<>();
        for (int count = startIndex; count <= endIndex; count++) {
            if (intStack.empty()) {
                intStack.push(A[count]);
            } else {
                if (intStack.peek() != A[count]) {
                    intStack.pop();
                } else {
                    intStack.push(A[count]);
                }
            }
        }

        if (!intStack.empty()) {
            int elementToBeLeader = intStack.peek();
            int elementToBeLeaderCount = 0;
            for (int count = startIndex; count <= endIndex; count++) {
                if (A[count] == elementToBeLeader) {
                    elementToBeLeaderCount++;
                }
            }
            int mid;
            int length = endIndex - startIndex + 1;
            if (length == 1) {
                mid = 0;
            } else
                mid = length / 2;

            if (elementToBeLeaderCount > mid)
                return elementToBeLeader;
        }
        throw new NoLeaderException();
    }

    class NoLeaderException extends Exception {

    }
}
