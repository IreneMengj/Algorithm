package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestDemo68 {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        int i = longestConsecutive(nums);
        System.out.println(i);
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max =1;
        int count =1;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int[] num = new int[set.size()];
        int j=0;
        for(int i:set){
            num[j++]=i;
        }
        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++){
            if(num[i]+1==num[i+1]){
                count++;
                max=Math.max(max,count);
            }else{
                count=1;
            }
        }

        return max;
    }
}
