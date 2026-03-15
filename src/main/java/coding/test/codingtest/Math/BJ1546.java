package coding.test.codingtest.Math;

import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int max = Integer.MIN_VALUE;

        double[] arr = new double[count];
        for(int i =0;i<count;i++){
            int a = sc.nextInt();
            if(a > max) {
                max =  a;
            }

            arr[i] = a;
        }

        double sum = 0;
        for(int i =0;i<arr.length;i++){
            double a = (arr[i] / max) * 100;
            sum += a;
        }
        System.out.print(sum/count);



    }
}
