package coding.test.codingtest.ExhaustiveSearch;

/**
 * sizes = N가지의 가로, 세로 길이
 * 4가지 가로 세로 길이의 명함을 모두 가지고 다닐 수 있는 지갑 크기를 구하라
 */
public class N1 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = solution(sizes);
        System.out.println(result);

    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth * maxHeight;
    }
}
