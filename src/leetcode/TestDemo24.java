package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TestDemo24 {
    public static void main(String[] args) {
        int[] arr1 = {-3,-3,4,-1,-10};
        int[] arr2 = {7,10};
        int d =12;
        int i = findTheDistanceValue(arr1, arr2, d);
        System.out.println(i);
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int j = 0;
            for (; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    break;
                }
            }
            if (j == arr2.length) {
                count++;
            }
        }
        return count;
    }
}

