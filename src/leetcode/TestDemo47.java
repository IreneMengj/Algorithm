package leetcode;

import java.util.Arrays;

public class TestDemo47 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        double v = trimMean(arr);
        System.out.println(v);
    }
    public static double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int sum=0;
        double v = n * 0.05;
        double v1 = n * 0.95;
        double v2 = n * 0.9;
        for(int i=(int)v;i<v1;i++){
            sum+=arr[i];
        }
        double avg = sum/v2;
        return avg;
    }
}
