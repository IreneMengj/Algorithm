package dataStructure;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*
    parameters: an array of integers and an integer target
    return value: an array of two indices
    here I will use two pointers which has a run time complexity of O(logn)
     */
    public int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        int left=0;
//        int right=nums.length-1;
//        while(left<right){
//            int sum = nums[left]+nums[right];
//            if(sum==target){
//                return new int[]{left,right};
//            }else if(sum<target){
//                left++;
//            }else{
//                right--;
//            }
//        }
      //here I made a mistake since I first thought I could solve it with two pointers but I could not return the
        //original indices so I change my method to hashmap.
        HashMap<Integer,String > map = new HashMap<>();

        return null;
    }
    public static void main(String[] args) {

    }
}
