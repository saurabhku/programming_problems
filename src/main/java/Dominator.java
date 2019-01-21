import java.util.Stack;

public class Dominator {
    public int solution(int A[]) {
        if (A.length == 0) {
            return -1;
        }

        try {
            int leader = findEquiLeader(A, 0, A.length - 1);
            for (int count = 0; count < A.length; count++) {
                if (A[count] == leader)
                    return count;
            }

        } catch (NoLeaderException e) {
            return -1;
        }
        return -1;
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
