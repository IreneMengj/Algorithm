package leetcode;
//1365. How Many Numbers Are Smaller Than the Current Number
public class TestDemo22 {
    public static void main(String[] args) {

    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] num = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                    num[i]=count;
                }
            }
            count =0;
        }

        return num;

    }
}
