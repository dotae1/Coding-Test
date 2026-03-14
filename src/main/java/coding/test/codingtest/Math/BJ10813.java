package coding.test.codingtest.Math;

import java.util.Scanner;

public class BJ10813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int temp;
        int[] arr = new int[N];

        for(int i = 1; i<=N; i++){
            arr[i-1] = i;
        }

        for(int i=0 ; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            temp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = temp;
        }

        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }


    }

}
