package leetcode;

public class TestDemo61 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int target = 5;
        int start=3;
        int minDistance = getMinDistance(nums, target, start);
        System.out.println(minDistance);
    }
    public static int getMinDistance(int[] nums, int target, int start) {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target&& min>(Math.abs(start-i))){
                min=Math.abs(start-i);
            }
        }
        return min;
    }
}
