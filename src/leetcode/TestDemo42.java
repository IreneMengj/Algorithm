package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class TestDemo42 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,3,1};
        int shortestSubArray = findShortestSubArray(nums);
        System.out.println(shortestSubArray);

    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> set = map.keySet();
        int max=0;
        for(int i:set){
            if(max<map.get(i)){
                max=map.get(i);
            }
        }
        int degree = 0;
        for(int i:set){
            if(map.get(i)==max){
                degree =i;
            }
        }
        int[] num = new int[max];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==degree){
                num[index]=i;
                index++;
            }
        }
        Arrays.sort(num);
        return num[num.length-1]-num[0]+1;
    }
}
