package coding.test.codingtest.StackorQueue;

import java.util.Arrays;
import java.util.Stack;

public class N6 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        int[] result = solution(prices);
        System.out.println(Arrays.toString(result));

    }

    /**
     * @param prices : 주식의 가격 변동 (1초당)
     * @return : index별로 몇초간 가격이 떨어지지 않고 유지되었는지 판별
     */
    public static int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }

//    public static int[] solution(int[] prices) {
//        Stack<Integer> stack = new Stack<>();
//        int[] result = new int[prices.length];
//
//        for (int i = 0; i < prices.length; i++) {
//            // 가격이 떨어졌을 때
//            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
//                int prevIndex = stack.pop();
//                result[prevIndex] = i - prevIndex;
//            }
//            stack.push(i);
//        }
//
//        // 끝까지 안 떨어진 경우
//        while (!stack.isEmpty()) {
//            int index = stack.pop();
//            result[index] = prices.length - 1 - index;
//        }
//
//        return result;
//    }
}
