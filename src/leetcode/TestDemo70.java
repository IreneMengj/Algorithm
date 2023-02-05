package leetcode;

import java.util.Arrays;

public class TestDemo70 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target= 9;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum(int[] numbers, int target){
        int start=0;
        int end =numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target) return new int[]{start,end};
            else if(numbers[start]+numbers[end]>target) end--;
            else start++;
        }
        return new int[]{start,end};
    }
}
