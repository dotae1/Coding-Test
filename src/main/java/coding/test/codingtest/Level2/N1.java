package coding.test.codingtest.Level2;

public class N1 {
    public static void main(String[] args) {
        int n = 23;
        int answer = solution(n);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int count = Integer.bitCount(n);

        while(true) {
            n++;
            if(Integer.bitCount(n) == count) {
                return n;
            }
        }
    }
}
