package coding.test.codingtest.IO;

import java.util.Scanner;

public class BJ2558 {

    /**
     * 백준알고리즘 2558번 문제
     * 두 정수 A+B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * 첫째 줄에 A, 둘째 줄에 B가 주어진다( 0 < A, B < 10 )
     */
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int A =  sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
    }
}
