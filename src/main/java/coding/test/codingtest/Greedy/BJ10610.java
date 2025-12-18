package coding.test.codingtest.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10610{
    public static void main(String[] args) throws IOException {
        /**
         * 백준 10610번 문제
         * 어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
         * 미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.
         * 입력 : N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.
         * 출력 : 미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[str.length()];


        int count = 0;
        int sum = 0;

        //입력받은 숫자를 하나하나 배열에 저장
        for(int i = 0 ; i<str.length();i++){
            arr[i] = str.charAt(i) - '0';
            sum += arr[i];
            if(arr[i] == 0 ) {
                count++;
            }
        }
        // 숫자에 0이 존재하지 않으면 30의 배수일 수가 없다.
        if(count == 0) {
            System.out.println(-1);
            return;
        }
        // 자리수의 합이 3의 배수가 아니면 30의 배수일 수가 없다.
        if((sum % 3) !=0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);

        for(int i =arr.length -1; i>=0;i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb);

    }
}
