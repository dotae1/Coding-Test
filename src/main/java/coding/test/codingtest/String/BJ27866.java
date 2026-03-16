package coding.test.codingtest.String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = sc.nextInt();
//
//        String[] str1 = new String[str.length()];
//
//        for(int i=0;i<str.length();i++){
//            str1[i] = str.substring(i,i+1);
//        }
//
//        System.out.println(str1[len-1]);

        StringBuffer sb = new StringBuffer(str);

        System.out.print(sb.charAt(len-1));

    }

}
