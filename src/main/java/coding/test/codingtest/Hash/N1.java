package coding.test.codingtest.Hash;

import java.util.HashMap;
import java.util.HashSet;

/**
 * participant = 마라톤 참가자
 * completion = 마라톤 완주자
 * => 완주하지 못한 사람을 찾는 것
 */
public class N1 {
    public static void main(String[] args) {
        //
        String[] participant = {"marina", "josipa", "dabinchoi", "jinsungpark", "seyeoncheon"};
        String[] completion = {"marina", "josipa", "dabinchoi", "seyeoncheon"};

        String fin = solution(participant, completion);
        System.out.println(fin);

    }

    public static String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        //참가자 카운트
        // map에 p가 존재하면 가져온 후 +1, 아니면 0에서 +1
        for( String p : participant ){
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for(String c : completion) {
            map.put(c, map.get(c) -1);
        }

        for(String key : map.keySet()){
            if(map.get(key) > 0) {
                return key;
            }
        }
        return "";
    }
}
