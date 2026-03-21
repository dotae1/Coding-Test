package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ25501 {

    static int result;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for(int i = 0; i <count; i++){
            String s = in.next();
            System.out.print(isPalindrome(s)+ " " + result);
            System.out.println();
        }
    }

    public static int recursion(String s, int l, int r) {
        result++;
        if ( l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);


    }

    public static int isPalindrome(String s) {
        result = 0;
        return recursion(s, 0, s.length()-1);
    }
}
