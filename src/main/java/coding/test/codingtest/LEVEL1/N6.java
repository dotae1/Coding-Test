package coding.test.codingtest.LEVEL1;

import java.util.Arrays;

public class N6 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] result = solution(n, arr1, arr2);

        System.out.println(Arrays.toString(result));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int merged = arr1[i] | arr2[i]; // 핵심

            String binary = String.format("%" + n + "s", Integer.toBinaryString(merged))
                    .replace(' ', '0'); // 앞자리 0 채우기

            String row = binary.replace('1', '#')
                    .replace('0', ' ');

            answer[i] = row;
        }

        return answer;
    }
}
