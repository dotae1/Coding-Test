package coding.test.codingtest.hard;

import java.util.Scanner;

public class BJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length() &&
                    str.charAt(i) == 'd' &&
                    str.charAt(i + 1) == 'z' &&
                    str.charAt(i + 2) == '=') {

                count++;
                i += 2;
            }

            else if (i + 1 < str.length() &&
                    str.charAt(i) == 'c' &&
                    (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {

                count++;
                i += 1;
            }

            else if (i + 1 < str.length() &&
                    str.charAt(i) == 'd' &&
                    str.charAt(i + 1) == '-') {

                count++;
                i += 1;
            }

            else if (i + 1 < str.length() &&
                    ((str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') ||
                            (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j'))) {

                count++;
                i += 1;
            }

            else if (i + 1 < str.length() &&
                    ((str.charAt(i) == 's' && str.charAt(i + 1) == '=') ||
                            (str.charAt(i) == 'z' && str.charAt(i + 1) == '='))) {

                count++;
                i += 1;
            }

            else {
                count++;
            }
        }

        System.out.println(count);
    }
}