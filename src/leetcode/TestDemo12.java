package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class TestDemo12 {
    public static void main(String[] args) {
        int[] nums={-1,-2,-3};
        int i = maximumProduct(nums);
        System.out.println(i);
    }
    public static int maximumProduct(int[] nums) {
        if(nums.length==1){
            return nums[0]*nums[0]*nums[0];
        }
        if(nums.length==2){
            return Math.multiplyExact(nums[0],nums[1]);
        }

        if(nums.length==3){
            return  nums[0]*nums[1]*nums[2];

        }
        Arrays.sort(nums);
        return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    }
}
