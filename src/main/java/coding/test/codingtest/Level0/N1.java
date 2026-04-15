package coding.test.codingtest.Level0;

import java.util.Arrays;

public class N1 {
    public static void main(String[] args) {

        int[] numbers = {0, 31, 24, 10, 1, 9};

        int result = solution(numbers);

        System.out.println(result);
    }
    public static int solution(int[] numbers) {
        Arrays.sort(numbers);

        return (numbers[numbers.length -1] * numbers[numbers.length -2]);
    }
}
