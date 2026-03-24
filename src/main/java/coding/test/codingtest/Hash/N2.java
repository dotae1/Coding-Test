package coding.test.codingtest.Hash;

import java.util.HashSet;

public class N2 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};

        int result = solution(nums);

        System.out.println(result);

    }

    private static int solution(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int count = nums.length / 2;

        for(int type : nums){
            set.add(type);
        }

        if(set.size() < count) {
            return set.size();
        } return count;
    }
}
