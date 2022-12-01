package leetcode;
//1314. Matrix Block Sum
import java.util.ArrayList;
import java.util.List;

public class TestDemo30 {
    public static void main(String[] args) {
        int[] nums ={1,1,2,3};
        int[] ints = decompressRLElist(nums);
        for(int i: ints){
            System.out.println(i);
        }
    }
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length/2;i++){
            for(int j=0;j<nums[2*i];j++){
                list.add(nums[2*i+1]);
            }
        }
        int[] num = new int[list.size()];
        for(int i=0;i<list.size();i++){
            num[i]=list.get(i);
        }
        return num;
    }
}
