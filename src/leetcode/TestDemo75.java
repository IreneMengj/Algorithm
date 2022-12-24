package leetcode;

import java.util.HashMap;
import java.util.Map;
//287. Find the Duplicate Number
public class TestDemo75 {
    public static void main(String[] args) {

    }
    public static int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                return i;
            }else{
                map.put(i,1);
            }
        }
        return -1;
    }
}
