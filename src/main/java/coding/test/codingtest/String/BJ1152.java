package coding.test.codingtest.String;

import java.util.Scanner;

public class BJ1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        /**
         * 이 비어있는 처리를 안하면 백준에서 에러가 발생
         */
        if(str.isEmpty()) {
            System.out.print(0);
            return;
        }

        int count = 0;

        String[] strs = str.split(" ");

        System.out.println(strs.length);

//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            if (c == ' ') {
//                if (i == 0 || i == str.length() - 1) {
//                    continue;
//                }
//                count++;
//            }
//        }
//
//        System.out.println(count + 1);
    }
}