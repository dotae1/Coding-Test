package coding.test.codingtest.String;

import java.util.Scanner;

public class BJ10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = str.length();
        int[] arr = {-1, -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

        for(int i = 0; i < count; i++){
            if(arr[str.charAt(i) - 97] != -1){
                continue;
            }
            arr[str.charAt(i) -97] = i;
        }

        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}

