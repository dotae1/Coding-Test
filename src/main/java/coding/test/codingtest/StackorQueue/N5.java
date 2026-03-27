package coding.test.codingtest.StackorQueue;

import java.util.LinkedList;
import java.util.Queue;

public class N5 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        int result = solution(bridge_length, weight, truck_weights);
        System.out.println(result);

    }

    /**
     * @param bridge_length : 다리에 올라갈 수 있는 차의 수
     * @param weight : 다리가 버틸 수 있는 무게
     * @param truck_weights : 대기하고 있는 트럭(kg) 배열
     * @return : 총 걸리는 시간
     */
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < bridge_length; i++){
            queue.add(0);
        }

        int time = 0;
        int current_weight = 0;
        int index = 0;
        // 2. 모든 트럭이 다리에 올라갈 때까지 반복
        while (index < truck_weights.length) {
            time++;

            // 다리 맨 앞에서 나가는 트럭의 무게를 현재 총 무게에서 뺌
            current_weight -= queue.poll();

            // 다음 트럭이 다리에 올라올 수 있는지 확인
            if (current_weight + truck_weights[index] <= weight) {
                // 올라올 수 있으면 트럭 추가
                queue.add(truck_weights[index]);
                current_weight += truck_weights[index];
                index++;
            } else {
                // 못 올라오면 0을 넣어서 다리 위의 트럭들만 한 칸 전진
                queue.add(0);
            }
        }

        // 3. 마지막 트럭이 다리에 올라간 상태에서 다리 길이만큼 더해주면 끝
        return time + bridge_length;
    }
}
