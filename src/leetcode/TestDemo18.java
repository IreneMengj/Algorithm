package leetcode;

import java.util.Arrays;

public class TestDemo18 {
    public static void main(String[] args) {
        int[] num = {5,1,2,3,4};
        int i = heightChecker(num);
        System.out.println(i);
    }
    public static int heightChecker(int[] heights) {
        int[] num =new int[heights.length];
        for(int i=0;i<heights.length;i++){
            num[i]=heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=num[i]){
                count++;
            }
        }
        return count;
    }
}
