package leetcode;

public class TestDemo32 {
    public static void main(String[] args) {
        int[] numbers={2,3,4};
        int target=6;
        int[] ints = twoSum(numbers, target);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }

}
