package leetcode;
//1295. Find Numbers with Even Number of Digits
public class TestDemo54 {
    public static void main(String[] args) {
        int[] nums={555,901,482,1771};
        int numbers = findNumbers(nums);
        System.out.println(numbers);
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i:nums){
            if(i/10>0&&i/100==0){
                count++;
            }
            else if(i/1000>0&&i/10000==0){
                count++;
            }
            else if(i/100000>0){
                count++;
            }
        }
        return count;
    }
}
