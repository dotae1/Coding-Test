package coding.test.codingtest.Math;

import java.util.Scanner;

public class BJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int cot = 0;
        for(int i = 1; i<=9; i++){
            int num =  sc.nextInt();
            if(num>max){
                max = num;
                cot = i;
            }
        }
        System.out.println(max);
        System.out.print(cot);
    }
}
