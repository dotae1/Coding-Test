package coding.test.codingtest.Level2;

import java.util.*;

public class N7 {
    public static void main(String[] args) {
        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        int result = solution(k, tangerine);
        System.out.println(result);
    }

    public static int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i :  tangerine){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> count = new ArrayList<>(map.values());

        count.sort(Collections.reverseOrder());

        int answer = 0;

        for(int counts : count){
            k-=counts;
            answer++;
            if(k<=0) break;
        }
        return answer;
    }
}
