package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ10870 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        int result = fibo(num);

        System.out.println(result);
    }

    public static int fibo(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibo(num - 1) + fibo(num - 2);
    }
}
