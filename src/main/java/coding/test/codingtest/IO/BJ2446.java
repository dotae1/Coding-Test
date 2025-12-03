package coding.test.codingtest.IO;

import java.util.Scanner;

public class BJ2446 {

    /**
     * 백준알고리즘 2446번 문제
     * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
     * 출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String star = "*";
        String space = " ";

        for(int i = count ; i > 0; i--){
            System.out.println(space.repeat(count-i) + star.repeat((2*i) - 1));
        }
        for(int j = 2; j <= count; j++){
            System.out.println(space.repeat(count-j) + star.repeat((2*j) - 1));
        }

    }
}
