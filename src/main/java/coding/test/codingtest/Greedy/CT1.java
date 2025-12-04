package coding.test.codingtest.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT1 {
    /**
     * 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 큰 수의 법칙에 따른 결과를 출력하시오.
     * 입력 : 첫째 줄에 N(2<= N <=1000), M, K의 자연수가 주어지며, 각 자연수는 공백으로 구분한다.
     * 둘째 줄에 N개의 자연수가 주어진다. 각 자연수는 공백으로 구분한다. 단 각각의 자연수는 1 이상 10,000 이하의 수로 주어진다.
     * 입력으로 주어지는 K는 항상 M보다 작거나 같다.
     * 출력 : 첫째 줄에 큰 수의 법칙에 따라 더해진 답을 출력한다.
     */
    // 결론 N개의 숫자가 주어지면, M번 더해서 제일 큰 수 만들기 ( but K번 초과하여 동일한 수를 더할 수 없다.)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //배열의 크기
        int M = Integer.parseInt(st.nextToken()); //숫자가 더해지는 횟수
        int K = Integer.parseInt(st.nextToken()); //조건

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(arr);
        int first = arr[N-1];
        int second = arr[N-2];

        int sum = 0;
        int count = 0;

        for(int i = 0; i < M; i++){
            if( count < K) {
                sum += first;
                count++;
            } else {
                sum += second;
                count = 0;
            }
        }
        System.out.println(sum);
    }
}
