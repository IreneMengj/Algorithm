package leetcode;
//1461. Check If a String Contains All Binary Codes of Size K
import java.util.Arrays;

public class TestDemo25 {
    public static void main(String[] args) {
        int[] target ={1,2,3,4};
        int[] arr = {2,3,4,1};
        boolean b = canBeEqual(target, arr);
        System.out.println(b);
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0;i<target.length;i++){
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }
}
