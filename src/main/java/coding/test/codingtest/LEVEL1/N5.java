package coding.test.codingtest.LEVEL1;

public class N5 {
    public static void main(String[] args) {
        int n = 5;
        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                n--;
            }
            n /= 2;
        }

        return count;
    }
}


