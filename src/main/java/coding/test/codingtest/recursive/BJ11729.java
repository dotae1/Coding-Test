package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ11729 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 총 이동 횟수
        System.out.println((int)Math.pow(2, n) - 1);

        hanoi(n, 1, 2, 3);

        System.out.println(sb);
    }

    public static void hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        // 1. n-1개 치우기
        hanoi(n - 1, from, to, via);

        // 2. 가장 큰 원판 이동
        sb.append(from).append(" ").append(to).append("\n");

        // 3. 나머지 원판 옮기기
        hanoi(n - 1, via, from, to);
    }
}