package coding.test.codingtest.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11719 {

    /**
     * 백준알고리즘 11719번 문제
     * 입력 받은 대로 출력하는 프로그램을 작성하시오.
     * 입력 : 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
     * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
     * 출력 : 입력받은 그대로 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        // br.readLine은 EOF가 아니면 작동하기에, 공백줄도 작동한다.
        // EOF : 빈줄이 아닌, 입력이 아예 끝난 것
        while((line=br.readLine())!=null){
            System.out.println(line);
        }


    }
}
