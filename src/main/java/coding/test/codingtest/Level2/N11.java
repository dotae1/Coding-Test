package coding.test.codingtest.Level2;

public class N11 {
    public static void main(String[] args) {
        int[][] lands = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

        int result = solution(lands);
        System.out.println(result);
    }
    public static int solution(int[][] land) {
        int n = land.length;

        for (int i = 1; i < n; i++) {
            land[i][0] += Math.max(land[i - 1][1],
                    Math.max(land[i - 1][2], land[i - 1][3]));

            land[i][1] += Math.max(land[i - 1][0],
                    Math.max(land[i - 1][2], land[i - 1][3]));

            land[i][2] += Math.max(land[i - 1][0],
                    Math.max(land[i - 1][1], land[i - 1][3]));

            land[i][3] += Math.max(land[i - 1][0],
                    Math.max(land[i - 1][1], land[i - 1][2]));
        }

        return Math.max(
                Math.max(land[n - 1][0], land[n - 1][1]),
                Math.max(land[n - 1][2], land[n - 1][3])
        );
    }
}
