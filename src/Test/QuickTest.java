package Test;

import Sort.Merge;
import Sort.Quick;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
        Integer[] a ={6,4,9,2,8,3,1};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
