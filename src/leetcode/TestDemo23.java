package leetcode;
//1347. Minimum Number of Steps to Make Two Strings Anagram
import java.util.HashMap;
import java.util.HashSet;

public class TestDemo23 {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        boolean b = checkIfExist(arr);
        System.out.println(b);
    }
    public static boolean checkIfExist(int[] arr) {

        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i]==2*arr[j]&&i!=j){
                    return true;
                }
            }
        }



        return false;
    }
}
