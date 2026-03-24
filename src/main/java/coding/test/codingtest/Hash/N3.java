package coding.test.codingtest.Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N3 {
    public static void main(String[] args) {
        String[] num = {"119", "97674223", "1195524421"};
        String [] num1 = {"123","456","789"};
        boolean result = solution1(num);
        System.out.println(result);
    }

    public static boolean solution(String[] phoneBook) {
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phoneBook);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phoneBook.length - 1; i++)
            // startsWith : 다음 배열의 값이 전값으로 시작하는지 체크
            // 정렬은 문자열순으로 하기에 1, 3번째 비교안해도됨 어차피 모여있음
            if (phoneBook[i + 1].startsWith(phoneBook[i]))
                return false;

        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }
    public static boolean solution1(String[] phoneBook) {
        // 1. HashMap을 선언한다.
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phoneBook.length; i++)
            map.put(phoneBook[i], i);

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 1; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return true;
    }
}
