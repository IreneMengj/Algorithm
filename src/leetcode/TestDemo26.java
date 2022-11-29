package leetcode;

import java.util.Arrays;

public class TestDemo26 {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k=2;
        int i = minimumDifference(nums,k);
        System.out.println(i);
    }

    public static int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }


        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (min > nums[i + 1] - nums[i]) {
                min = nums[i + 1] - nums[i];
            }
        }
        return min;
    }
}
