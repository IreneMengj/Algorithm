package leetcode;

import java.util.*;
import java.util.stream.Stream;

/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

 */
public class TestDemo6 {
    public static void main(String[] args) {
        int[] nums ={1,1,0,1,1,1,0,1,1,1,1,0,1,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,0);
        List<Integer> list = new ArrayList<>();

        for(int i:nums){
            if(i==1){
                map.put(1,map.get(i)+1);
            }else{
                list.add(map.get(1));
                map.put(1,0);
            }

        }
        list.add(map.get(1));
        int max =0;
        for(int i:list){
            if(max<=i){
                max=i;
            }
        }
        return max;
    }
}
