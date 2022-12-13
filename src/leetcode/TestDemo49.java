package leetcode;

public class TestDemo49 {
    public static void main(String[] args) {
        int i= 81;
        int j =10;
        int count =0;
        while(i-j>=0){
            i=i-j;
            count++;
        }
        System.out.println(count);
        System.out.println(i);
    }

}
