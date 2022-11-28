package leetcode;
/*
645. Set Mismatch
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TestDemo13 {
    public static void main(String[] args) {

        int[] nums = {1,3,3};
        int[] errorNums = findErrorNums(nums);
        for(int i : errorNums){
            System.out.println(i);
        }

    }
    public static int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] num = new int[2];
        Arrays.sort(nums);




        for(int i:nums){
            if(!set.add(i)){
                num[0]=i;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[0]!=1){
                num[1]=1;
            }else if(nums[nums.length-1]!= nums.length){
                num[1]=nums.length;
            }
            else if(nums[i+1]-nums[i]>1){
                num[1]=nums[i+1]-1;
            }

        }

        return num;

    }
}

