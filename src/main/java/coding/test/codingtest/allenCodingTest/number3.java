package coding.test.codingtest.allenCodingTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 입력
 * String[] paragraphs = [
 *   ["hello", "world"],
 *   ["How", "areYou", "doing"],
 *   ["Please look", "and align", "to right"]
 * ]
 * String[] aligns = ["LEFT", "RIGHT", "RIGHT"]
 * int width = 16;
 * 출력
 * ******************
 * *hello world     *
 * *How areYou doing*
 * *     Please look*
 * *       and align*
 * *        to right*
 * ******************
 *
 */

public class number3 {
    public static void main(String[] args) {


        String[][] paragraphs = {{"hello", "world"}, {"How", "areYou", "doing"}, {"Please look", "and align", "to right"}};
        String[] aligns = {"LEFT", "RIGHT", "RIGHT"};
        int width = 16;

        String[] result = solution(paragraphs, aligns, width);

        for (String line : result) {
            System.out.println(line);
        }

    }
    public static String[] solution(String[][] paragraphs, String[] aligns, int width) {

        List<String> lines = new ArrayList<>();

        for (int i = 0; i < paragraphs.length; i++) {
            // world 첫번째 단어 가져옴
            String[] words = paragraphs[i];
            //정렬 기준 가져옴
            String align = aligns[i];

            String line = "";

            for (int j = 0; j < words.length; j++) {
                // 첫번째 단어 배열의 첫번째 단어를 가져옴
                String word = words[j];
                // 만약 첫번째 단어면 추가
                if (line.equals("")) {
                    line = word;
                } // 아니면 더했을 때 width초과하는지 검사 후 추가
                else if (line.length() + 1 + word.length() <= width) {
                    line += " " + word;
                } // 아니면 초과라서 줄바꿈 해야함
                else {
                    lines.add(makeLine(line, align, width));
                    line = word;
                }
            }
            // 마지막으로 마지막 줄 추가
            lines.add(makeLine(line, align, width));
        }

        List<String> result = new ArrayList<>();

        // 첫번째 별 줄 추가
        String border = "*".repeat(width + 2);
        result.add(border);

        // 단어 추가
        for (String l : lines) {
            result.add("*" + l + "*");
        }

        // 마지막 줄 추가
        result.add(border);

        // List형태를 배열로 변경
        return result.toArray(new String[0]);
    }

    private static String makeLine(String line, String align, int width) {
        int space = width - line.length();

        if (align.equals("LEFT")) {
            return line + " ".repeat(space);
        } else {
            return " ".repeat(space) + line;
        }
    }

}
