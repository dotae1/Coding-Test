package coding.test.codingtest.String;

import java.util.Scanner;

public class BJ2908 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        //StringBuilder에 reverse()라는 편리한 기능 존재

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        System.out.print( a > b ? a : b);

    }
}
