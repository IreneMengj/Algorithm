package leetcode;

import java.util.Arrays;

public class TestDemo84 {
    public static void main(String[] args) {
        int[] arr = {4,0,1,2,3};
        int i = maxChunksToSorted(arr);
        System.out.println(i);
    }
    public static int maxChunksToSorted(int[] arr) {
        if (arr == null) return 0;
        int ret = 0;
        int right = arr[0];
        for (int i = 0; i < arr.length; i++) {
            right = Math.max(right, arr[i]);
            if (right == i) ret++;
        }
        return ret;

    }
}
