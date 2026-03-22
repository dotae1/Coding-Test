package coding.test.codingtest.allenCodingTest;

import java.util.HashSet;
import java.util.Set;

/**
 * 입력
 * firstArray = [12345, 12999, 567, 56]
 * secondArray = [12888, 56123, 56999]
 * 출력 : 2
 *
 */
public class number4 {
    public static void main(String[] args) {

        int[] firstArray = {25, 288, 2655, 54546, 54, 555};
        int[] secondArray = {2, 255, 266, 244, 26, 5, 54547};
        int result = solition(firstArray, secondArray);

        System.out.println(result);
    }
    public static int solition(int[] firstArray, int[] secondArray) {
        Set<String> set = new HashSet<>();

        for(int num : firstArray){
            String s = String.valueOf(num);

            String prefix = "";
            for(char c : s.toCharArray()){
                prefix += c;
                set.add(prefix);
            }
        }
        int max = 0;
        for(int num : secondArray){
            String s = String.valueOf(num);
            String prefix = "";

            for(char c : s.toCharArray()){
                prefix += c;

                if(set.contains(prefix)){
                    max = Math.max(max, prefix.length());
                }
            }
        }
        return max;
    }
}
