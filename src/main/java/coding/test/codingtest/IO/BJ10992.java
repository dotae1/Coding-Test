package coding.test.codingtest.IO;

import java.util.Scanner;

public class BJ10992 {

    /**
     * 백준알고리즘 10991번 문제
     * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
     *  1일때
     *  *
     *  2일때
     *   *
     *  ***
     *  3일때
     *    *
     *   * *
     *  *****
     *  4일때
     *     *
     *    * *
     *   *   *
     *  *******
     * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
     * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String space = " ";

        for(int i = 1 ; i <= count; i++){
            System.out.print(space.repeat(count - i));

            if (i == 1) {
                // 맨 위
                System.out.println("*");
            }
            else if (i == count) {
                // 마지막 줄 (꽉 찬 줄)
                System.out.println("*".repeat(2 * count - 1));
            }
            else {
                // 속이 빈 삼각형
                System.out.print("*");                        // 왼쪽 별
                System.out.print(" ".repeat(2 * i - 3));      // 가운데 공백
                System.out.println("*");                     // 오른쪽 별
            }
        }
    }
}
