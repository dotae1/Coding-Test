package coding.test.codingtest.String;

import java.util.Scanner;

public class BJ9086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < count; i++){
            String str= sc.nextLine();
            System.out.println(""+str.charAt(0) + str.charAt(str.length()-1));
        }

    }
}
