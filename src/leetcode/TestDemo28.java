package leetcode;

import java.util.Arrays;
//1492. The kth Factor of n
public class TestDemo28 {
    public static void main(String[] args) {
        int[] salary ={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double average = average(salary);
        System.out.println(average);

    }
    public static double average(int[] salary) {
        Arrays.sort(salary);
        if(salary.length==3){
            return salary[1];
        }
        int sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum=sum+salary[i];
        }
        double average = (double) sum/(salary.length-2);
        return average;
    }
}
