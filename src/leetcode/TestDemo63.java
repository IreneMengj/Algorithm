package leetcode;

public class TestDemo63 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int i = numIdenticalPairs(nums);
        System.out.println(i);
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        String s = "new";
        char c = s.charAt(1);
        sb.append(c);
        return count;
    }
}
