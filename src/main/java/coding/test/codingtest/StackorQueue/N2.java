package coding.test.codingtest.StackorQueue;

import java.util.*;

/**
 * 입력
 * int[] progresses = 작업하는 프로세스의 진행률
 * int[] speeds = 1일간의 작업 속도
 * 주의사항 : 첫번째 작업이 7일이 걸려 완성이 되었을 때 그 전에 뒤 작업이 완료되어도 배포할 수 없음
 * 첫번째 작업이 끝나는 시점에 함께 배포됨
 * 출력 : if 1=7일, 2=3일, 3=9일 걸렸다고 가정하면
 * 7일에 2개 배포되고, 9일에 1개 배포되므로 결과값은 2 1
 */
public class N2 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] progresses1 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 1, 1, 1, 1, 1};

        int[] answer = solution(progresses,speeds);

        for(int i = 0; i< answer.length; i++){
            System.out.print(answer[i] + " ");
        }

    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i < progresses.length;i++) {
            // 남은 작업량 : 100 - 현재 작업량
            int remaining = 100 - progresses[i];
            // day : 남은 작업량 / 하루 작업속도 -> 총 걸리는 일 수
            int day = remaining / speeds[i];
            // 남은 작업량 / 하루 작업량 != 0 => 남은 작업량이 있다는 뜻으로 하루 추가
            if(remaining % speeds[i] != 0) {
                day++;
            }
            queue.add(day);
        }
        List<Integer> answerList = new ArrayList<>();

        // Queue가 존재하면
        while(!queue.isEmpty()) {
            // 첫 작업이 끝나는데 걸리는 일수 즉 첫 배포 일
            int firstDay = queue.poll();
            int count = 1;

            // 값이 존재하고 두번째 값이 첫 배포일보다 작다면 없애고 count++ => 즉 첫 배포일에 같이 배포 가능
            while(!queue.isEmpty() && queue.peek() <= firstDay) {
                queue.poll();
                count++;
            }
            answerList.add(count);
        }
        return answerList.stream().mapToInt(x->x).toArray();


    }
}
