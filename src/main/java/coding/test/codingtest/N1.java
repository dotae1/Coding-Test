package coding.test.codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {5, 6, 3}};

        int[] result = solution(array, commands);

        System.out.println(Arrays.toString(result));

    }
    public static int[] solution(int[] array, int[][] commands) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            for(int j = 0; j < commands[i].length; j++){
                list.add(commands[i][j]);
            }
        }



    }
}
