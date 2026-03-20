package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ2447 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                star(i, j);
            }
            System.out.println();
        }
    }

    public static void star(int i, int j) {
        /**
         * 00 01 02 03 04 05 06 07 08
         * 10 11 12 13 14 15 16 17 18
         * 20 21 22 23 24 25 26 27 28
         * 30 31 32 33 34 35 36 37 38
         * 40 41 41 43 44 45 46 47 48
         * 50 51 52 53 54 55 56 57 58
         * 60 61 62 63 64 65 66 67 68
         * 70 71 72 73 74 75 76 77 78
         * 80 81 82 83 84 85 86 87 88
         */
        if (i % 3 == 1 && j % 3 == 1) {
            System.out.print(" ");
            return;
        }

        if (i / 3 > 0 || j / 3 > 0) {
            star(i / 3, j / 3);
        } else {
            System.out.print("*");
        }
    }
}