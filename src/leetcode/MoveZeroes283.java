package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums={1,0,1,1,0,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i :nums){
            if(i==1){
                count++;
            }else{
                list.add(count);
                count=0;
            }
        }
        list.add(count);
        Collections.sort(list);

        return list.get(list.size()-1);
    }
}
