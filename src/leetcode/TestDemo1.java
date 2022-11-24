package leetcode;

import java.util.HashMap;

public class TestDemo1 {
    public static void main(String[] args) {

    }
        public static int singleNumber(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i:nums){

                if(map.containsKey(i)){
                    int value = map.get(i);
                    value++;
                }
                map.put(i,map.getOrDefault(i,0)+1);

            }
            for(int key:map.keySet()){
                if(map.get(key)==1){
                    return key;
                }
            }
            return -1;

        }
    }

