package leetcode;

public class TestDemo35 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] concatenation = getConcatenation(nums);
        for(int i:concatenation){
            System.out.println(i);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans =new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int j=nums.length;
        for(int i:nums){
            ans[j]=i;
            j++;
        }
        return ans;
    }
}
