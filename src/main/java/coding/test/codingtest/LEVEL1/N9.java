package coding.test.codingtest.LEVEL1;

public class N9 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;

        int result = solution(number, limit, power);
        System.out.println(result);

    }
    public static int solution(int number, int limit, int power) {
        int[] nums = new int[number];
        for(int i = 1; i <= number; i++){
            nums[i-1] = i;
        }
        int k = 0;
        int[] counts = new int[nums.length];
        for(int num : nums) {
            int count = 0;
            for(int i =1; i<=num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }
            counts[k] = count;
            k+=1;
        }
        int result = 0;
        for(int res : counts) {
            if(res > limit) {
                result += power;
            } else {
                result += res;
            }
        }
        return result;
    }
}
