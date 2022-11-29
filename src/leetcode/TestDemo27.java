package leetcode;

import java.util.Arrays;
//1503. Last Moment Before All Ants Fall Out of a Plank
public class TestDemo27 {
    public static void main(String[] args) {
        int[] arr = {13,12,-12,9,9,16,7,-10,-20,0,18,-1,-20,-10,-8,15,15,16,2,15};
        boolean b = canMakeArithmeticProgression(arr);
        System.out.println(b);
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length<3){
            return true;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
