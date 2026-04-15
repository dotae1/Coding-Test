package coding.test.codingtest.LEVEL1;

import java.util.Arrays;

public class N3 {
    public static void main(String[] args) {
        String[] strings = {"car", "sun", "bed"};
        int n = 1;

        String[] result = solution(strings, n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });

        return strings;
    }
}
