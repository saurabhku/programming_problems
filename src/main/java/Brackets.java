import java.util.Stack;

/*


A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

        S is empty;
        S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
        S has the form "VW" where V and W are properly nested strings.

For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

    int solution(char *S);

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0,
as explained above.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..200,000];
        string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".


 */
public class Brackets {

    public int solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for( char val: chars) {
            boolean isOpeningChar = checkOpeningChar(val);
            boolean isClosingChar = checkClosingChar(val);
            if (isClosingChar && stack.isEmpty()) {
                return 0;
            }
            if (isOpeningChar) {
                stack.push(val);
            }
            if (isClosingChar) {
                char topOfStack = stack.peek();
                if ( (val == ')' && topOfStack =='(')  || (val == ']' && topOfStack =='[') ||(val == '}' && topOfStack =='{')) {
                    stack.pop();
                } else
                    return  0;

            }
        }
        if (stack.isEmpty())
        return 1;
        else
            return 0;
    }

    private boolean checkOpeningChar(char val) {
        return val == '(' || val == '[' || val =='{';
    }

    private boolean checkClosingChar(char val) {
        return val == ')' || val == ']' || val =='}';
    }
}
