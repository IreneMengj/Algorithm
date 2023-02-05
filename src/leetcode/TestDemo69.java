package leetcode;

public class TestDemo69 {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        int i = maxProfit(nums);
        System.out.println(i);
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        return max;
    }
}
