package coding.test.codingtest.recursive;

import java.util.Scanner;

public class BJ2563 {
    public static void main(String[] args) {

        boolean[][] arr = new boolean[100][100];
        int total = 0;
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j < x+10; j++){
                for(int j2 = y; j2 < y+10; j2++){
                    if(!arr[j][j2]){
                        arr[j][j2] = true;
                        total++;
                    }
                }

            }
        }
        System.out.println(total);
    }
}
