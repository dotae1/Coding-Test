package coding.test.codingtest.LEVEL1;

public class N7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String result = solution(a, b);

        System.out.println(result);
    }

    public static String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += months[i];
        }

        totalDays += b;

        return days[(totalDays - 1) % 7];
    }
}
