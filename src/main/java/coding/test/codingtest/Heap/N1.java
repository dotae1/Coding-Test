package coding.test.codingtest.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 섞은 음식의 스코빌 지수 : 가장 맵지 않은 음식의 스코빌 지수 + (주 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 * K이상의 스코빌 지수를 만들기 위해 섞어야 하는 최소 횟수
 */
public class N1 {
    public static void main(String[] args) {
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int K = 7;

        int result = solution(scovile, K);
        System.out.println(result);

    }
    public static int solution(int[] scoville, int K) {
//        List<Integer> list = new ArrayList<>();
//        for(int s : scoville){
//            list.add(s);
//        }
//        int result = 0;
//        while (true) {
//            Collections.sort(list);
//
//            if (list.get(0) >= K) {
//                return result;
//            }
//
//            if (list.size() < 2) {
//                return -1;
//            }
//
//            int first = list.remove(0);
//            int second = list.remove(0);
//
//            int newScoville = scovile(first, second);
//            list.add(newScoville);
//            result++;
//            }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 2. 모든 스코빌 지수를 큐에 담기
        for (int s : scoville) {
            pq.add(s);
        }

        int count = 0;

        // 3. 가장 작은 값이 K보다 작을 때까지만 반복
        while (pq.peek() < K) {
            // 4. 음식이 1개밖에 안 남았는데 아직도 K 미만이면 불가능한 경우
            if (pq.size() < 2) return -1;

            // 5. 가장 안 매운 것과 두 번째로 안 매운 것 꺼내기
            int first = pq.poll();
            int second = pq.poll();

            // 6. 섞어서 다시 넣기
            int mixed = first + (second * 2);
            pq.add(mixed);
            count++;
        }

        return count;
    }
}
