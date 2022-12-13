package leetcode;

import java.util.Arrays;

public class TestDemo45 {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        boolean monotonic = isMonotonic(nums);
        System.out.println(monotonic);


    }
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]) decreasing = false;
            if(nums[i]>nums[i+1]) increasing = false;

        }
        return increasing||decreasing;
    }

}
