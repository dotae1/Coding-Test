package coding.test.codingtest.IO;

import java.util.Scanner;

public class BJ2445 {

    /**
     * 백준알고리즘 2445번 문제
     * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
     * *        *
     * **      **
     * ***    ***
     * ****  ****
     * **********
     * ****  ****
     * ***    ***
     * **      **
     * *        *
     * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
     * 출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String star = "*";
        String space = " ";

        for(int i = 1; i <= count; i++){
            System.out.println(star.repeat(i) + space.repeat((2*count)-(2*i)) + star.repeat(i));
        }
        for(int j = count -1; j > 0; j--){
            System.out.println(star.repeat(j) + space.repeat((2*count)-(2*j)) + star.repeat(j));
        }
    }
}
