package coding.test.codingtest.LEVEL1;

/**
 *  int n = 벽의 크기(M), n=4라면 1m씩 4개 구간으로 나눔
 *  int m = 롤러의 길이
 *  int[] section = 칠해야 하는 구간
 *  문제 : section에 존재하는 구간을 롤러로 칠할 때 최소 몇번의 칠로 완수할 수 있는가?
 */
public class N10 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        int result = solution(n, m, section);
        System.out.println(result);
    }

    /**
     * 1. section
     */
    public static int solution(int n, int m, int[] section) {
        int count = 0;
        int lastPoint = 0;

        for(int num : section) {
            if(num > lastPoint) {
                lastPoint = num + m -1;
                count++;
            }
        }
        return count;
    }
}
