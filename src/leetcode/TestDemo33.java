package leetcode;
//162. Find Peak Element
import java.util.Arrays;

public class TestDemo33 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
    }
    public static int findPeakElement(int[] nums) {

        int[] num = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        for(int i =0;i<num.length;i++){
            if(num[i]==max){
                return i;
            }
        }
       return -1;
    }
}
