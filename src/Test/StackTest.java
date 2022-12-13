package Test;

import linear.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("i");
        stack.push("r");
        String pop = stack.pop();
        System.out.println(pop);

    }
}
