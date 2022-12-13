package leetcode;

import java.util.Arrays;

public class TestDemo36 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n=4;
        int[] shuffle = shuffle(nums, n);
        for(int i:shuffle){
            System.out.println(i);
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int i = 0;
        int j = n;
        int curr = 0;
        while (i < n) {
            res[curr] = nums[i];
            curr++;
            i++;
            res[curr] = nums[j];
            curr++;
            j++;
        }
        return res;

    }
}
