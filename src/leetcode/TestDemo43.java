package leetcode;

import java.util.HashSet;
import java.util.Set;

public class TestDemo43 {
    public static void main(String[] args) {
        int[] nums = {6,6,6,6};
        int i = distributeCandies(nums);
        System.out.println(i);
    }
    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int max =0;
        for(int i:candyType){
            set.add(i);
        }
        if(set.size()>=candyType.length/2){
            max=candyType.length/2;
        }else{
            max=set.size();
        }
        return max;
    }
}
