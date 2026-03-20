package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ2738 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        int[][] arr1 = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int x = sc.nextInt();
                arr1[i][j]  = arr[i][j] + x;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
