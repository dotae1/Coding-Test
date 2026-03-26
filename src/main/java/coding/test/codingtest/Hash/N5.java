package coding.test.codingtest.Hash;

import java.util.*;
/**
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
 * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 */
public class N5 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500 };

        int[] result = solution(genres, plays);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] genres, int[] plays) {

        Map<String, Integer> map = new HashMap<>();
        // Key : 장르, value : 재생수로 Map에 집어넣기
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) +plays[i]);
        }
        // keySet : 맵의 키들만 뽑아와서 정렬 가능한 리스트로 만들기
        List<String> genreOrder = new ArrayList<>(map.keySet());

        // 두 장르를 비교하는 람다식, b의 총합이 크면 양수 -> b가 앞으로(내림차순)
        genreOrder.sort( (a, b) -> map.get(b) - map.get(a));
        List<Integer> result = new ArrayList<>();

        // 총 재생 수를 기준으로 정렬된 장르 순회
        for(String genre : genreOrder) {
            List<Integer> songs = new ArrayList<>();
            // genres(장르)의 고유번호(i)를 찾아서 songs에 수집
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(genre)) {
                    songs.add(i);
                }
            }
            // 재생수가 다르면 내림차순, 같으면 오름차순
            // a != b 일시 양수면 b가 앞으로 음수면 a가 앞으로 감.
            songs.sort((a, b) -> plays[a] != plays[b] ? plays[b] - plays[a] : a - b);

            result.add(songs.get(0));
            // 2개까지만 추가
            if (songs.size() >= 2) result.add(songs.get(1));
        }
        // List<Integer>를 int[]배열로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
