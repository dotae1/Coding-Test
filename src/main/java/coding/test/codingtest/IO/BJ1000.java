package coding.test.codingtest.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ1000 {

    /**
     * 백준알고리즘 1000번 문제
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//
//        System.out.println(A+B);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A+B);

    }
}
