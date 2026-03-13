package coding.test.codingtest.Math;

import java.util.Scanner;

public class BJ25314 {

    /**
     * 4 -> long int
     * 20 -> long long long long long int
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = n/4;
        String str = "";
        for(int i = 1; i<=count; i++) {
            str += "long ";
        }
        str += "int";
        System.out.print(str);
    }
}
