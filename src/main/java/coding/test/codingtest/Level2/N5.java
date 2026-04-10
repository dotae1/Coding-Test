package coding.test.codingtest.Level2;

import java.util.Arrays;

public class N5 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        int result = solution(people, limit);

        System.out.println(result);

    }
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int count = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            count++;
        }

        return count;
    }
}
