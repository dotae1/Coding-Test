package coding.test.codingtest.hard;

import java.util.*;

public class BJ1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int count = 0;

        while (n-- > 0) {
            String str = sc.nextLine();
            //중복 허용 X
            Set<Character> set = new HashSet<>();

            boolean isGroup = true;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                // 이전 문자랑 다른데 이미 나온 문자면 실패
                if (i > 0 && c != str.charAt(i - 1) && set.contains(c)) {
                    isGroup = false;
                    break;
                }

                set.add(c);
            }

            // true일 경우만 count
            if (isGroup) count++;
        }

        System.out.println(count);
    }
}

