package coding.test.codingtest.LEVEL1;

import java.util.Arrays;

public class N4 {
    public static void main(String[] args) {

        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int result = solution(A, B);

        System.out.println(result);
    }

    public static int solution(int[] a, int[] b)  {

        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        int k = 1;

        for(int i = 0; i < a.length; i++){
            sum+=a[i] * b[b.length-k];
            k++;
        }
        return sum;
    }
}
