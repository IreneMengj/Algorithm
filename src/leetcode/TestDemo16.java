package leetcode;
//977. Squares of a Sorted Array
import java.util.Arrays;

public class TestDemo16 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ints = sortedSquares(nums);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i =0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
