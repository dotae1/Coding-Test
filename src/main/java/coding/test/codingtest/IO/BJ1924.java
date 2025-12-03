package coding.test.codingtest.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1924 {

    /**
     * 백준알고리즘 1924번 문제
     * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
     * 입력 : 첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다.
     * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
     * 출력 : 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //첫번째 수를 월로 입력 받는다.
        int mon = Integer.parseInt(st.nextToken());
        //두번째 수를 일로 입력 받는다.
        int day =  Integer.parseInt(st.nextToken());

        //1월1일이 월요일, 1년은 365일 요일만 알아내면되기에, 364/7 = 52

        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int sum = 0;
        for (int i = 1; i < mon ; i++) {
            sum += month[i];
        }

        sum +=day;

        int result = sum % 7;

        System.out.println(days[result]);
    }
}
