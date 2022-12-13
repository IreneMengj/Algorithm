package Test;

import Sort.Merge;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] a ={6,4,9,2,8,3,1};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
