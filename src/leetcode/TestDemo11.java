package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class TestDemo11 {
    public static void main(String[] args) {
        int[] nums = {2,2,3};
        int i = thirdMax(nums);
        System.out.println(i);
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[1];
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);

        }
        int[] nums1 = new int[set.size()];
        int count =0;
        for(int i:set){
            nums1[count]=i;
            count++;
        }
        Arrays.sort(nums1);
        if (nums1.length<3){
            return nums1[nums1.length-1];
        }
        return nums1[nums1.length-3];

    }
}
