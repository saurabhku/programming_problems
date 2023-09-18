/*

It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
Each person wears a sticker indicating their initial position in the queue from 1 to n.
Any person can bribe the person directly in front of them to swap positions, but they still wear
their original sticker. One person can bribe at most two others.

Determine the minimum number of bribes that took place to get to a given queue order.
Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic

Example
q = [1,2,3,4,5,6,7,8]
if a person 5 bribes 4, the queue will look like this: [1,2,3,5,4,6,7,8]. Only 1  bribe is required. Print 1.

q = [4,1,2,3]
Person 4 had to bribe 3 people to get to the current position. Print Too chaotic.
 */

import java.util.List;

public class NewYearChaos {
    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */
    public static void minimumBribes(List<Integer> q) {
        int numberOfBribes = 0;
        for (int i = 0; i < q.size(); i++) {
            int originalPosition = q.get(i) - 1;

            // Check if the person has moved more than two positions ahead of their original position
            if (originalPosition - i > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for ( int j= Math.max(0, originalPosition-1) ; j < i ; j ++) {
                if (q.get(j) > q.get(i)) {
                    numberOfBribes++;
                }
            }


        }
        System.out.println(numberOfBribes);
    }
}
