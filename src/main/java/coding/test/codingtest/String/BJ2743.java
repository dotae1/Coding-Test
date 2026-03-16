package coding.test.codingtest.String;

import java.util.Scanner;

public class BJ2743 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.print(sb.length());


    }
}
