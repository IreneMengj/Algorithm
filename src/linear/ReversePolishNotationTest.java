package linear;

public class ReversePolishNotationTest {
    public static void main(String[] args) {
       String[] notation={"3","17","15","-","*","18","6","/","+"};
       int result=calculate(notation);
        System.out.println(result);
    }
    public static int calculate(String[] notation){
        Stack<Integer> stack = new Stack<>();
        for(String s:notation){
            switch (s){
                case "+":
                    Integer pop1 = stack.pop();
                    Integer pop2 = stack.pop();
                    int i = pop2 + pop1;
                    stack.push(i);
                    break;
                case "-":
                    Integer pop3 = stack.pop();
                    Integer pop4 = stack.pop();
                    int i1 = pop4 - pop3;
                    stack.push(i1);
                    break;
                case "*":
                    Integer pop5 = stack.pop();
                    Integer pop6 = stack.pop();
                    int i2 = pop6 * pop5;
                    stack.push(i2);
                    break;
                case "/":
                    Integer pop7 = stack.pop();
                    Integer pop8 = stack.pop();
                    int i3 = pop8 / pop7;
                    stack.push(i3);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}
