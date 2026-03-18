package coding.test.codingtest.hard;

import java.util.Scanner;

public class BJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String star = "*";

        for(int j =count-1; j>-1; j--) {
                System.out.println(" ".repeat(j) + star.repeat((count*2-1)-(j*2)));
        }
        for(int i = 1; i<count; i++) {
                System.out.println(" ".repeat(i) + star.repeat((count*2-1)-(i*2)));
        }
    }
}
