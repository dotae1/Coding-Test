package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ2447 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                star(i, j);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void star(int i, int j) {

        while (i > 0 || j > 0) {

            if (i % 3 == 1 && j % 3 == 1) {
                sb.append(" ");
                return;
            }

            i /= 3;
            j /= 3;
        }

        sb.append("*");
    }
}