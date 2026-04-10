package coding.test.codingtest.Level2;

import java.util.Arrays;

public class N4 {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        int[] result = solution(brown, yellow);

        System.out.println(Arrays.toString(result));

    }
    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for(int height = 1; height <= total; height++){
            if(total % height == 0){
                int width = total / height;

                if((width-2) * (height-2) == yellow) {
                    return new int[]{width, height};
                }
            }
        }
        return new int[]{0,0};
    }
}
