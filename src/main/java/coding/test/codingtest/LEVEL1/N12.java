package coding.test.codingtest.LEVEL1;

import java.util.Arrays;
import java.util.Stack;

public class N12 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};
        int[] result = solution(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        int index = 0;

        for (int num : numbers) {

            // 현재 숫자가 더 크면
            // 스택에 있던 애들의 뒷 큰수 확정
            while (!stack.isEmpty()
                    && numbers[stack.peek()] < num) {

                answer[stack.pop()] = num;
            }

            // 현재 위치 저장
            stack.push(index);

            index++;
        }

        return answer;
    }
}
