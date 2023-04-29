import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
//        int[] arr={2,5,7,3,4,9,22,11,15,14};
//        ArrayList<Integer> list = new ArrayList<>();
//        long start = System.currentTimeMillis();
//        int max=0;
//        for(int i=0;i<arr.length;i++){
//            list.add(arr[i]);
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
//        System.out.println(max);

        ArrayList<Integer> list1 = new ArrayList<>(25);
        for(int i=0;i<10;i++){
            list1.add(3*i);
        }
        list1.set(6,44);
        System.out.println(list1);

    }
}
