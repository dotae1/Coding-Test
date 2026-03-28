package coding.test.codingtest.array;
import java.util.Arrays;

public class N1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution(array, commands);

        System.out.println(Arrays.toString(result));

    }
    public static int[] solution(int[] array, int[][] commands) {
        // 결과를 담을 배열 (commands의 개수만큼 생성)
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] temp = Arrays.copyOfRange(array, start, end);

            Arrays.sort(temp);

            answer[i] = temp[k];
        }

        return answer;
    }
}
