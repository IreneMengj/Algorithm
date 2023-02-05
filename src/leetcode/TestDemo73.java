package leetcode;

import java.util.Arrays;

public class TestDemo73 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target =0;
        int search = search(nums, target);
        System.out.println(search);
    }
    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid;
            else start=mid;
        }
        return -1;
    }
}
