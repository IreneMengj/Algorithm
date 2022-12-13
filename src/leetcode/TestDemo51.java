package leetcode;

import java.util.HashMap;

public class TestDemo51 {
    public static void main(String[] args) {
        int[] arr ={17,18,5,4,6,1};
        int[] ints = replaceElements(arr);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public static int[] replaceElements(int[] arr) {
        if(arr.length==1){
            arr[0] =-1;
            return arr;
        }
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                arr[i]=max;
            }
        }
        arr[arr.length-1]=-1;

        return arr;


    }
}
