package coding.test.codingtest.array;

import java.util.Arrays;

/**
 * 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하인용되었다면
 * h의 최댓값이 이 과학자의 H-INDEX이다.
 */
public class N3 {
    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};
        int result = solution(citations);

        System.out.println(result);

    }

    public static int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순 {0, 1, 3, 5, 6}

        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 위치에서 남은 논문 수

            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}
