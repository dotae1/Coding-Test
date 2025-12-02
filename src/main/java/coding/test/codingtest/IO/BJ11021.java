package coding.test.codingtest.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11021 {

    /**
     * 백준알고리즘 11021번 문제
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
     * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = "Case #";

        for(int i = 1 ; i <= N ; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(str + i + ": " + (A+B));
        }

    }
}
