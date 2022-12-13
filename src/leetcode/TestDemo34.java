package leetcode;

public class TestDemo34 {
    public static void main(String[] args) {
        int[] nums ={5,0,1,2,3,4};
        int[] ints = buildArray(nums);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
