package coding.test.codingtest.Level0;

public class N2 {
    public static void main(String[] args) {
        int slice = 4;
        int n = 12;

        int result = solution(slice, n);

        System.out.println(result);

    }
    public static int solution(int slice, int n) {
        int count = 1;

        for(int i =count; i <= n; count++) {
            if(count* slice >= n) {
                return count;
            }
        }
        return count;

    }
}
