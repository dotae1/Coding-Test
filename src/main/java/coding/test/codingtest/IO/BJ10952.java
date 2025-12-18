package coding.test.codingtest.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10952 {

    /**
     * 백준알고리즘 10952번 문제
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
     * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
     * 입력의 마지막에는 0 두 개가 들어온다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A==0 && B==0) break;

            System.out.println(A+B);
        }

    }
}
