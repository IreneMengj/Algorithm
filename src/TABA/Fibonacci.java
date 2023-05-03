package TABA;
/*
The Fibonacci sequence is a series of numbers in which each number is the sum of the two
preceding ones, usually starting with 0 and 1.
The first few numbers in the Fibonacci sequence are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
It is named after Leonardo Fibonacci, an Italian mathematician who introduced the sequence to the Western world in his book Liber Abaci.
The Fibonacci sequence appears in many areas of mathematics and science, including number theory, geometry,
and physics.
 */
/*
Base Case (i.e. when to stop)
• Work toward Base Case
• Recursive Call
 */
public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
