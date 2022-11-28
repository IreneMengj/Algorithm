package leetcode;
//Sort Array By Parity
import java.util.ArrayList;

public class TestDemo15 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int[] ints = sortArrayByParity(nums);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(i%2==0){
                list.add(i);
            }
        }
        for(int i:nums){
            if(i%2 != 0){
                list.add(i);
            }
        }
        int[] num = new int[nums.length];
        for(int i=0;i<num.length;i++){
            num[i]=list.get(i);
        }
        return num;

    }
}
