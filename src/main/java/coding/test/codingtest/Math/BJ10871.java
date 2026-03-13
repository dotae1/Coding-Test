package coding.test.codingtest.Math;

import java.util.Scanner;

public class BJ10871 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int x =  sc.nextInt();

        int[] arrr = new int[n];

        for(int i=0; i < n; i++){
            arrr[i] = sc.nextInt();
            if(arrr[i] < x){
                System.out.print(arrr[i] + " ");
            }
        }
    }
}
