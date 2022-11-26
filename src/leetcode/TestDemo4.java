package leetcode;

/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 */

import java.util.*;

public class TestDemo4 {
    public static void main(String[] args) {
        int[] nums = {2,2};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
        public static List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list = new ArrayList<>();
            Arrays.sort(nums);
            if(nums[nums.length-1]!=nums.length){
                list.add(nums.length);
            }
            if(nums[0]!=1){
                list.add(1);
            }
            Set<Integer> set = new HashSet<>();
            for(int i=1;i<nums.length;i++){
                set.add(nums[i]);
            }
            for(int i =2;i<nums.length;i++){
                if(!set.contains(i)){
                    list.add(i);
                }
            }
            return list;
        }
    }

