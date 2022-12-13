package leetcode;

public class TestDemo37 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int i = pivotIndex(nums);
        System.out.println(i);
    }
    public static int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int leftSum =0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            if(sum-leftSum-nums[i+1]==leftSum){
                return i;
            }
        }
        return -1;
    }
}
