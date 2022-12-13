package leetcode;

public class TestDemo59 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int i = maxProfit(prices);
        System.out.println(i);
    }
    public static int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int profit = 0;
        for(int i =0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                profit+=prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}
