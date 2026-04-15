package coding.test.codingtest.LEVEL1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class N2 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] result = solution(k, score);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]); // 일단 넣고

            // k개 초과하면 가장 작은 값 제거
            if (pq.size() > k) {
                pq.poll();
            }

            // 현재 명예의 전당 최하위 점수
            answer[i] = pq.peek();
        }

        return answer;
    }
}
