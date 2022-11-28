package leetcode;

import java.util.Arrays;

//976. Largest Perimeter Triangle
public class TestDemo17 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,6};
        int i = largestPerimeter(nums);
        System.out.println(i);
    }
    public static int largestPerimeter(int[] nums) {
        for (int i = nums.length - 1; i > 1; --i)
            if (nums[i - 2] + nums[i - 1] > nums[i])
                return nums[i - 2] + nums[i - 1] + nums[i];

        return 0;
    }
}
