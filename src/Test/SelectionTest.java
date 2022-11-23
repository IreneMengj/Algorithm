package Test;

import Sort.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {243,65,67,321,8,76,2};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
