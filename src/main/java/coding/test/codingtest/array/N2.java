package coding.test.codingtest.array;

import java.util.Arrays;

/**
 * int[] number 배열을 통해 만들 수 있는 수 조합을 만들어 그 중 가장 큰 숫자를 찾아라
 */
public class N2 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2,213, 4,97};
        String result = solution(numbers);

        System.out.println(result);
    }

    public static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}
