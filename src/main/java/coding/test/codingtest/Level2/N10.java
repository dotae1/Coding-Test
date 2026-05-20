package coding.test.codingtest.Level2;

import java.util.HashSet;
import java.util.Set;

public class N10 {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        int result = solution(elements);
        System.out.println(result);

    }

    public static int solution(int[] elements) {

        int n = elements.length;

        int[] arr = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            arr[i] = elements[i % n];
        }

        Set<Integer> set = new HashSet<>();

        for (int start = 0; start < n; start++) {

            int sum = 0;

            for (int len = 0; len < n; len++) {

                sum += arr[start + len];

                set.add(sum);
            }
        }

        return set.size();
    }
}
