package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ27433 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();
        sc.close();

        System.out.println(factorial(num));


    }

    public static long factorial(long n){
        if(n > 0) {
            return n * factorial(n-1);
        } else return 1;
    }
}
