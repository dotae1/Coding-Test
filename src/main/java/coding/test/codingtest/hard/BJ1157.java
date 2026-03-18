package coding.test.codingtest.hard;

import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String newString = str.toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < newString.length(); i++) {
            arr[newString.charAt(i) - 65]++;
        }

        int max = -1;
        int count = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i;
                count = 0;
            } else if (arr[i] == max) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("?");
        } else {
            System.out.println((char)(num + 65));
        }
    }
}