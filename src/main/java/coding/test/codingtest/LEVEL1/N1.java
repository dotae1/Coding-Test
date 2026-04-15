package coding.test.codingtest.LEVEL1;

public class N1 {
    public static void main(String[] args) {

        int[] food = {1, 3, 4, 6};
        String result = solution(food);
        System.out.println(result);

    }

    public static String solution(int[] food) {
        String result = "";
        for(int i = 1; i < food.length; i++){
            int answer = food[i] / 2;
            while( answer > 0){
                result += i;
                answer--;
            }
        }
        String result1 = "";
        for(int i = result.length()-1; i >= 0; i--){
            result1 += result.charAt(i);
        }
        String answer = result + "0" + result1;
        return answer;
    }
    /**
     * StringBuilder를 통한 Reverse 연산
     * for문 이중중첩을 통한 연산
     * 2가지도 가능하다. 코드를 짜면서도 좀 쓸데없이 복잡한 느낌이 들음.
     */
}
