package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class TestDemo52 {
    public static void main(String[] args) {
        int[] arr = {1,2};

        boolean b = uniqueOccurrences(arr);
        System.out.println(b);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Integer> set = map.keySet();
        int[] arr1 = new int[map.size()];
        int j=0;
        for(int i:set){
            arr1[j]=map.get(i);
            j++;
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]==arr1[i+1]){
                return false;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,3);
        return true;


    }
}
