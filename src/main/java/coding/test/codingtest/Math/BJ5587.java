package coding.test.codingtest.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BJ5587 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[28];
        List<Integer> arr1 = new ArrayList<>();

        for(int i = 0; i < 28; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int a = 0;

        for(int i = 1; i <= 30; i++){

            if(a < 28 && arr[a] == i){
                a++;
            }else{
                arr1.add(i);
            }
        }

        System.out.println(arr1.get(0));
        System.out.println(arr1.get(1));
    }
}