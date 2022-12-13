package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TestDemo38 {
    public static void main(String[] args) {
        int[] num ={2,1,5};
        int k =806;
        List<Integer> integers = addToArrayForm(num, k);
        System.out.println(integers);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        String s = "";
        for(int i:num){
            s+=i;
        }
        int j = Integer.parseInt(s);
        j=j+k;
        String s1 = String.valueOf(j);
        for(int i=0;i<s1.length();i++){
            int c = Character.getNumericValue(s1.charAt(i));
            list.add(c);
        }

        return list;
    }
}
