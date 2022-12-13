package leetcode;

import java.util.*;

public class TestDemo60 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrace(nums,0,list,new ArrayList<Integer>());
        return list;
    }
    public static void backtrace(int[] nums,int start,List<List<Integer>> list,List<Integer> track){
        list.add(new ArrayList<>(track));
        for(int i =start;i<nums.length;i++){
            if(i!=start&&nums[i]==nums[i-1]) continue;
            track.add(nums[i]);
            backtrace(nums,i+1,list,track);
            track.remove(track.size()-1);
        }
    }
}
