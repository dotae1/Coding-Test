package coding.test.codingtest.Math;

import java.io.*;
import java.util.*;

public class BJ9613 {
    /**
     * 백준알고리즘 9613번 문제
     * 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
     * 입력 : 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다.
     * 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.
     * 출력 : 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int tc = 0; tc < t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()); // 수의 개수
            int[] arr = new int[n];

            // n개의 수 입력
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0; // 합이 커질 수 있으니 long으로

            // 가능한 모든 쌍 (i < j)에 대해 gcd 합
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }

    // 유클리드 호제법으로 gcd 구하기
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
