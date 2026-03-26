package coding.test.codingtest.Hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 코니가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class N4 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "face"}, {"blue_sunglasses", "face"}, {"green_turban", "face"}};

        int result = solution(clothes);
        System.out.println(result);

    }
    public static int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for(String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) +1);
        }

        int answer = 1;

        for(int count : map.values()) {
            answer *= (count+1);
        }

        return answer -1;


    }
}
