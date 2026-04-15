package coding.test.codingtest.Level0;

public class N3 {
    public static void main(String[] args) {
        int n = 100;
        int result = solution(n);
        System.out.println(result);

    }

    public static int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
