package coding.test.codingtest.Level2;

public class N8 {
    public static void main(String[] args) {
        int n = 4;
        long answer = solution(n);
        System.out.println(answer);
    }

    public static long solution(int n) {
        long[] dp = new long[n + 1];

        dp[1] = 1;
        if (n >= 2) dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
