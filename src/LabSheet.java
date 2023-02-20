import java.util.Scanner;

public class LabSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a Java script LargeNumber.java which takes two integers and outputs the larger of two numbers
//        System.out.println("please enter one number");
//        int i = sc.nextInt();
//        System.out.println("please enter one number");
//        int j=sc.nextInt();
//        int max=i>j?i:j;
//        System.out.println(max);
        //Write a Java script SmallerNumber.java which takes two integers and outputs the smaller of two numbers
        System.out.println("please enter one number");
        int i = sc.nextInt();
        System.out.println("please enter one number");
        int j=sc.nextInt();
        long start = System.currentTimeMillis();
        int min=i<j?i:j;
        long end = System.currentTimeMillis();
        System.out.println(min);
        System.out.println(end-start);


    }
}
