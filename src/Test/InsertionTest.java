package Test;

import Sort.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a ={243,65,67,321,8,76,2};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
