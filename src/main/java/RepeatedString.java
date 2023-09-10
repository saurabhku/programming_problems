/*
There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.

Example
s = 'abcac'
n= 10

The substring we consider is abcacabcac, the first 10 characters of the infinite string.
 There are 4  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
 */
class RepeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        long countOfAInOriginalString = 0;
        long totalA = 0;

        countOfAInOriginalString = s.chars().filter(c -> c == 'a').count();

        long numberOfCompleteStrings = n/s.length();
        totalA = numberOfCompleteStrings*countOfAInOriginalString;

        long leftOver = n%s.length();
        for (int i = 0; i < leftOver; i++) {
            if (s.charAt(i) == 'a') {
                totalA++;
            }
        }

        // Write your code here
        return totalA;
    }

}