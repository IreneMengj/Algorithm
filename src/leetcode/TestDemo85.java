package leetcode;

public class TestDemo85 {
    public static void main(String[] args) {
        int x = 1534236469;
        int reverse = reverse(x);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
        int reverse=0;
        int pop;
        while(x!=0){
            pop=x%10;
            x=x/10;
            if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE/10&&pop>7)return 0;
            if(reverse<Integer.MIN_VALUE/10 || reverse== Integer.MIN_VALUE/10 &&pop<-8) return 0;
            reverse = reverse*10+pop;
        }

        return reverse;
    }
}
