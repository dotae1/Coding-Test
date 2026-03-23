package coding.test.codingtest.StackorQueue;

import java.util.Stack;

/**
 * 올바른 () 찾기 Stack을 활용
 */
public class N3 {
    public static void main(String[] args) {
        String s = ")()(";
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = "(()(";

        boolean result = solution(s3);
        System.out.println(result);

    }
    public static boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if( c== '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
