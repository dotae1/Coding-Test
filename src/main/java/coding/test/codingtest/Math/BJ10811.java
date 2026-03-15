package coding.test.codingtest.Math;

import java.util.Scanner;

public class BJ10811 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a =  sc.nextInt();
        int b = sc.nextInt();
        int temp;

        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            arr[i] = i+1;
        }

        for(int i = 0; i < b; i++) {
            int c = sc.nextInt()-1;
            int d = sc.nextInt()-1;

            while(c<d) {
                temp = arr[c];
                arr[c] = arr[d];
                arr[d] = temp;
                c++;
                d--;
            }
        }

        sc.close();

        for(int i = 0; i < a; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
