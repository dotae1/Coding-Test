package coding.test.codingtest.allenCodingTest;

/**
 * 입력
 * alpha2beta = [50, 120, 300] -> 알파에서 베타로 출발하는 시간
 * beta2alpha = [200, 400, 600] -> 베타에서 알파로 출발하는 시간
 * 두 배열은 정렬되어 있다고 가정
 * missions = (알파 -> 베타 -> 알파)의 횟수
 * 출력 : 마지막 미션 완수 후 도착 시간
 */
public class number2 {
    public static void main(String[] args) {
        int[] alpha2beta = {50, 120, 300};
        int[] beta2alpha = {200, 400, 600};
        int missions = 2;

        int result = solution(alpha2beta, beta2alpha, missions);

        System.out.println(result);

    }

    static int solution(int[] arr1, int[] arr2, int missions) {
        int time = 0;
        int i = 0, j = 0;
        
        for(int x = 0; x < missions; x++){

            for(; i < arr1.length; i++) {
                if(arr1[i] >= time) {
                    time = arr1[i]+100;
                    i++;
                    break;
                }
            }
            for(; j < arr2.length; j++) {
                if(arr2[j] >= time) {
                    time = arr2[j]+100;
                    j++;
                    break;
                }
            }
        }
        return time;

    }
}
