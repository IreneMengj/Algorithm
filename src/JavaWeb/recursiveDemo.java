package JavaWeb;

public class recursiveDemo {
    public static void main(String[] args) {
        System.out.println(function(3));
        printStar(7);
        System.out.println(fibonacci(4));
        System.out.println(fibonacciIterative(5));
    }

    public static int function(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * function(n - 1);
        }
    }

    public static void printStar(int n) {
        if (n == 0) {
            System.out.print("*");
        } else {
            System.out.print("*");
            printStar(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 2) {
            return 1;
        } else {
            int curr = 1;
            int pre = 1;
            for (int i = 2; i < n; i++) {
                int temp = curr;
                curr += pre;
                pre = temp;
            }
            return curr;
        }


    }
}


