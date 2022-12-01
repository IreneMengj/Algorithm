package leetcode;

import java.util.Arrays;

public class TestDemo31 {
    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int sum=0;
        for(int i:nums){
            if(i<0){
                continue;
            }else {
                sum += i;
            }
        }
        return sum;
    }
}
