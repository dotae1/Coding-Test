package coding.test.codingtest.Math;

import java.util.Scanner;

public class BJ10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[M];

        for(int i = 1; i <= N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int j = a-1; j <= b-1; j++) {
                arr[j] = c;
            }
        }

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }


    }
}
