package coding.test.codingtest.Math;

import java.io.*;
import java.util.*;

public class BJ2609 {
    /**
     * 백준알고리즘 2609번 문제
     * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
     * 입력 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
     * 출력 : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int a = A;
        int b = B;

        // 최대공약수 (gcd) - 유클리드 호제법
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int gcd = a;
        int lcm = A / gcd * B;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
