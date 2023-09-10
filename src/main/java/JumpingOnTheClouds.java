import java.security.InvalidParameterException;
import java.util.List;

class JumpingOnTheClouds {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int pathLength=0;

        for (int current=0; current <c.size()-1;) {
            if ( current+2 < c.size() && c.get(current+2) == 0) {
                pathLength++;
                current = current+2;
            } else if(c.get(current+1) == 0 ){
                pathLength++;
                current++;
            }
            else {
                throw new InvalidParameterException("No path possible");
            }
        }
        return pathLength;
    }

}
