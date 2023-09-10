/*
An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, , or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

Example

steps = 8
path = [DDUUUUDD]


The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.

 2 <=steps <=100000
 path[i] ∈ {UD}
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int count(int steps, String path) {
        return IntStream.range(0, steps)
                .mapToObj(i -> path.charAt(i))
                .reduce(new int[]{0, 0}, (acc, step) -> {
                    int currentLevel = acc[0];
                    int valleys = acc[1];

                    if (step == 'U') {
                        if (currentLevel == -1) {
                            valleys++;

                        }
                        currentLevel++;
                    } else if (step == 'D') {
                        currentLevel--;
                    } else {
                        throw new IllegalArgumentException("Invalid step in the path: " + step);
                    }

                    return new int[]{currentLevel, valleys};
                }, (acc1, acc2) -> {
                    acc1[0] += acc2[0];
                    acc1[1] += acc2[1];
                    return acc1;
                })[1];
    }

}

