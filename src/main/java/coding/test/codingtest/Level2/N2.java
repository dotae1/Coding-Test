package coding.test.codingtest.Level2;

import java.util.Arrays;

public class N2 {
    public static void main(String[] args) {
        String s = "110010101001";
        int[] answer =solution(s);
        System.out.println(Arrays.toString(answer));

    }
    public static int[] solution(String s) {
        int count = 0; // 변환 횟수
        int zeroCount = 0; // 제거한 0 개수

        while (!s.equals("1")) {
            // 1. 0 제거
            int originalLength = s.length();
            s = s.replace("0", "");
            int removedZeros = originalLength - s.length();
            zeroCount += removedZeros;

            // 2. 길이를 2진수로 변환
            int length = s.length();
            s = Integer.toBinaryString(length);

            count++;
        }

        return new int[]{count, zeroCount};
    }
}
