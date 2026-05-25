package coding.test.codingtest.LEVEL1;

public class N11 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String result = solution(s,skip,index);
        System.out.println(result);
    }
    public static String solution(String s, String skip, int index){
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            int count = 0;
            char current = c;

            while (count < index) {
                current++;

                if (current > 'z') {
                    current = 'a';
                }

                if (skip.indexOf(current) == -1) {
                    count++;
                }
            }

            answer.append(current);
        }

        return answer.toString();
    }
}
