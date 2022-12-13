package leetcode;

import java.util.HashMap;
import java.util.Set;

public class TestDemo48 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        int specialInteger = findSpecialInteger(arr);
        System.out.println(specialInteger);
    }
    public static int findSpecialInteger(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){

            map.put(i,map.getOrDefault(i,0)+1);

    }
    int n = arr.length;
    double v = n*0.25;
    Set<Integer> set = map.keySet();
        for(int i:set){
        if(map.get(i)>v){
            return i;
        }
    }
        return -1;
}
}
