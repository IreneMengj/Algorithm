package leetcode;

public class TestDemo71 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,6,4};
        int peakElement = findPeakElement(nums);
        System.out.println(peakElement);
    }
    public static int findPeakElement(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int m = i + (j - i) / 2;
            if (nums[m] > nums[m + 1]) j = m;
            else i = m + 1;
        }
        return i;
    }
}
