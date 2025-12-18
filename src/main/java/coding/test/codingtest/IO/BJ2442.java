package coding.test.codingtest.IO;

import java.util.Scanner;

public class BJ2442 {

    /**
     * 백준알고리즘 2442번 문제
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
     * 별은 가운데를 기준으로 대칭이어야 한다.
     * 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
     * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
     */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String star = "*";
        String space = " ";

        for(int i = 1; i <= count; i++){
            System.out.println(space.repeat(count-i) + star.repeat((2*i)-1));
        }
    }
}
