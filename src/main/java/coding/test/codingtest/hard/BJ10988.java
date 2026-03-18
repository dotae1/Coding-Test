package coding.test.codingtest.hard;

import java.util.Scanner;

public class BJ10988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int result = 1;


//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                result = 0;
//                break;
//            }
//        }

        String newString = new StringBuilder(str).reverse().toString();

        if(str.equals(newString)){
            result =1;
        } else {
            result =0;
        }

        System.out.println(result);
    }
}
