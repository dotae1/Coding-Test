package coding.test.codingtest.IO;

import java.util.Scanner;

public class BJ10991 {

    /**
     * 백준알고리즘 10991번 문제
     * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
     *  1일때
     *  *
     *  2일때
     *   *
     *  * *
     *  3일때
     *    *
     *   * *
     *  * * *
     * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
     * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String space = " ";

        for(int i = 1 ; i <= count; i++){
            System.out.print(space.repeat(count - i));

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
