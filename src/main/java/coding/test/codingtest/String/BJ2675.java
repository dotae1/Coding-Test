package coding.test.codingtest.String;

import java.util.Scanner;

public class BJ2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count =  sc.nextInt();

        for(int i = 0; i < count; i++){
            int num = sc.nextInt();
            String str = sc.next();

            for(int j = 0; j < str.length(); j++){
                System.out.print(String.valueOf(str.charAt(j)).repeat(num));
            }
            System.out.println();
        }
    }
}
