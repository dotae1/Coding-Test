package coding.test.codingtest.StackorQueue;

import java.util.*;

/**
 * 현재 실행 대기 큐(Queue)에 있는 프로세스의 중요도가 순서대로 담긴 배열 priorities와,
 * 몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location이 매개변수로 주어질 때,
 * 해당 프로세스가 몇 번째로 실행되는지 return 하도록 solution 함수를 작성해주세요.
 */
public class N4 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        int result =  solution(priorities, location);
        System.out.println(result);

    }

    public static int solution(int[] priorities, int location) {

        // 1. 큐에 [인덱스, 우선순위] 쌍으로 넣기
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        int order = 0;

        // 2. 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {

            // 3. 맨 앞 프로세스 꺼내기
            int[] cur = queue.poll();

            // 4. 큐에 나보다 우선순위 높은게 있는지 확인
            boolean hasHigher = false;
            for (int[] p : queue) {
                // 인덱스, 우선순위쌍에서 우선순위를 비교
                if (p[1] > cur[1]) {
                    hasHigher = true;
                    break;
                }
            }

            // 5. 높은게 있으면 다시 뒤로
            if (hasHigher) {
                queue.add(cur);

                // 6. 없으면 실행
            } else {
                order++;
                // 7. 내가 찾는 프로세스면 반환
                if (cur[0] == location) {
                    return order;
                }
            }
        }

        return order;
    }
}

