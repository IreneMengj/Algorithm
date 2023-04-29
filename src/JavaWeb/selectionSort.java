package JavaWeb;

import java.util.ArrayList;
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        selectionSort ss = new selectionSort();
        int arr[]={432,6,32,654,765,12,34};
        //ss.selectionSort(arr);
        ss.bubbleSort(arr);
        ss.insertionSort(arr);
    }
    public void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int smallest =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void insertionSort(int[] arr){
        int i=1;
        while(i<arr.length){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
