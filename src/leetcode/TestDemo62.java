package leetcode;

import java.util.Arrays;

public class TestDemo62 {
    public static void main(String[] args) {
        int[] nums={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int i = arraySign(nums);
        System.out.println(i);
    }
    public static int arraySign(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i:nums){
            if(i<0){
                count++;
            }else if(i==0) {
                return 0;
            }else{
                break;
            }
        }
        if(count%2==0) return 1;
        return -1;
    }
}
