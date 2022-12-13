package leetcode;

import java.util.Arrays;

public class TestDemo65 {
    public static void main(String[] args) {
        int[] nums={1,2,3,2};
        int i = sumOfUnique(nums);
        System.out.println(i);
    }
    public static int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                i+=1;
                continue;
            }
            sum+=nums[i];
        }
        return sum;
    }
}
