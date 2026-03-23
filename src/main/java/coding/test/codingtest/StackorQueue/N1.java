package coding.test.codingtest.StackorQueue;

import java.util.LinkedList;
import java.util.Queue;

public class N1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = solution(arr);

        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }

    }

    public static int[] solution(int[] arr) {

        Queue<Integer> queue = new LinkedList<>();

        int prev = 0;

        for(int num : arr) {
            if(num != prev) {
                queue.offer(num);
                prev = num;
            }
        }
        return queue.stream().mapToInt(x->x).toArray();
    }
}
