package coding.test.codingtest.allenCodingTest;

import org.springframework.web.bind.annotation.PatchMapping;

/**
 * 입력 : ['A', 'b', 'B', 'c', 'C', 'c', 'A']
 * 출력 : 3
 * 대 & 소문자가 같은 문자는 같은 취급
 * 다른 문자가 왔을 시 count + 1
 */
public class number1 {

    public static void main(String[] args) {
        char[] arr = {'A', 'b', 'B', 'c', 'C', 'c', 'A'};

        int result = solution(arr);
        System.out.println(result);
    }

    static int solution(char[] arr){
        int count=0;
        for(int i = 1; i < arr.length; i++) {
            if(Character.toUpperCase(arr[i-1]) != Character.toUpperCase(arr[i])) {
                count+=1;
            }
        }
        return count;
    }

}
