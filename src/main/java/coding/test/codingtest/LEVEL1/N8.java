package coding.test.codingtest.LEVEL1;

import java.util.Arrays;

public class N8 {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4 ,2};

        int result = solution(k, m, score);
        System.out.println(result);
    }
    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int result = 0;
        int x = 1;

        for(int i = score.length; i >= 0; i--) {
            if(i == score.length - m*x) {
                result += score[i] * m;
                if(i < m) break;
                x++;
            }
        }
        return result;

    }
}
