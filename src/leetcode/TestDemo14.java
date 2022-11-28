package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDemo14 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int i = dominantIndex(nums);
        System.out.println(i);

    }
    public static int dominantIndex(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        Arrays.sort(nums);
        if(nums[nums.length-1]>=nums[nums.length-2]*2){
            int index = list.indexOf(nums[nums.length-1]);
            return index;
        }
        return -1;


    }

}
