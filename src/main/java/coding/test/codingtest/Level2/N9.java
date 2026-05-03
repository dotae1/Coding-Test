package coding.test.codingtest.Level2;

import java.util.HashMap;
import java.util.Map;

public class N9 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int result = solution(want, number, discount);
        System.out.println(result);

    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 초기 10일 세팅
        Map<String, Integer> window = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            window.put(discount[i], window.getOrDefault(discount[i], 0) + 1);
        }

        if (check(wantMap, window)) answer++;

        // 슬라이딩
        for (int i = 10; i < discount.length; i++) {
            // 앞 제거
            String remove = discount[i - 10];
            window.put(remove, window.get(remove) - 1);
            if (window.get(remove) == 0) {
                window.remove(remove);
            }

            // 뒤 추가
            String add = discount[i];
            window.put(add, window.getOrDefault(add, 0) + 1);

            if (check(wantMap, window)) answer++;
        }

        return answer;
    }

    private static boolean check(Map<String, Integer> map1, Map<String, Integer> map2){
        for(String key : map1.keySet()){
            if(!map2.containsKey(key) || !map1.get(key).equals(map2.get(key))){
                return false;
            }
        }
        return true;
    }
}
