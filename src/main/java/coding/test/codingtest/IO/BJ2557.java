package coding.test.codingtest.IO;

public class BJ2557 {
    /**
     * 백준알고리즘 입출력 2557번 문제
     * Hello World!를 출력하시오.
     * start, end를 통해 걸리는 시간 Check
     */
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        System.out.print("Hello World!");

        long end = System.currentTimeMillis();

        System.out.println("\n실행시간 : " + (end - start) + " ns");
    }
}
