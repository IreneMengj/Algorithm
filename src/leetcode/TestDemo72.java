package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestDemo72 {
    public static void main(String[] args) {
        int[] nums ={-1,0};
        int target =-1;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target) return new int[]{start+1,end+1};
            else if(numbers[start]+numbers[end]>target) end--;
            else start++;
        }
        Set<Integer> set = new HashSet<>();

        return new int[]{start,end};
    }
}
