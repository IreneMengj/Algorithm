package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestDemo19 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] ints = relativeSortArray(arr1, arr2);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        String s = "this4";


        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i<arr1.length;i++){

            if(map.containsKey(arr2[i])&&map.get(arr2[i])>0){
                list.add(arr2[i]);
                Integer count = map.get(arr2[i]);
                count-=1;
                map.put(arr2[i],count);
            }
            if(!map.containsKey(arr2[i])){
                list1.add(arr2[i]);
            }
        }
        int[] num = new int[list.size()+list1.size()];
        int[] num1 = new int[list1.size()];
        for(int i =0;i<list.size();i++){
            num[i]=list.get(i);
        }
        for(int i=0;i<list1.size();i++){
            num1[i]=list1.get(i);
        }
        Arrays.sort(num1);
        int j=0;
        for(int i = list.size();i<num.length;i++){
            num[i]=num1[j];
            j++;
        }
        return num;
    }
}
