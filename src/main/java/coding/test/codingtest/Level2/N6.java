package coding.test.codingtest.Level2;

import java.util.Arrays;

public class N6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;

        int result = solution(a, b, n);
        System.out.println(result);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int newCola = (n / a) * b;
            answer += newCola;
            n = (n % a) + newCola;
        }

        return answer;
    }
}
