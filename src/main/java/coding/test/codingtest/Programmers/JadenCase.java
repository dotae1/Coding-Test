package coding.test.codingtest.Programmers;

public class JadenCase {
    public static void main(String[] args) {
        String answer = "3people unFollowed me";
        String answer1 ="for the last week";

        String result = solution(answer1);
        System.out.println(result);
    }

    static String solution(String s){
        StringBuilder sb = new StringBuilder();

        boolean isFirst =  true;

        for (char c : s.toLowerCase().toCharArray()) {
            sb.append(isFirst ? Character.toUpperCase(c) : c);
            isFirst = (c== ' ');
        }
        return sb.toString();
    }
}
