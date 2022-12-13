package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo56 {
    public static void main(String[] args) {
        int[] nums = {4,3,10,9,8};
        List<Integer> integers = minSubsequence(nums);
        System.out.println(integers);
    }
    public static List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int tempSum=0;
        Arrays.sort(nums);
        int index=0;
        for(int i=nums.length-1;i>=0;i--){
            tempSum+=nums[i];
            if(sum-tempSum<tempSum){
                index = i;
                break;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j=nums.length-1;j>=index;j--){
            list.add(nums[j]);
        }
        return list;
    }
}
