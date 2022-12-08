package leetcode;
//1389. Create Target Array in the Given Order
import java.util.ArrayList;

public class TestDemo53 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,0};
        int[] index={0,1,2,3,0};
        int[] targetArray = createTargetArray(nums, index);
        for(int i:targetArray){
            System.out.println(i);
        }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] target=new int[list.size()];
        for(int i=0;i<list.size();i++){
            target[i]=list.get(i);
        }
        return target;
    }
}
