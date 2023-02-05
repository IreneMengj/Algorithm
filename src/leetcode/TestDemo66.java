package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestDemo66 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i) && map.get(i)>=2) {
                continue;
            } else {
                map.put(i, map.getOrDefault(i,0)+1);
            }

        }
        int count=0;
        Set<Integer> integers = map.keySet();
        TreeSet<Integer> set = new TreeSet<>(integers);
        set.comparator();
        for(int i:integers){
            Integer j = map.get(i);
            while(j>0){
                nums[count++]=i;
                j--;
        }

        }
        return count;

    }
}

