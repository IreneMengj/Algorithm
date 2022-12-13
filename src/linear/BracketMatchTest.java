package linear;

public class BracketMatchTest {
    public static void main(String[] args) {
        String str = "(shanghai(beijing)))";
        boolean match = isMatch(str);
        System.out.println("whether brackets in str are matched:"+match);
    }
    public static boolean isMatch(String str){
        Stack<String> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            String s = str.charAt(i) + "";
            if(s.equals("(")){
                stack.push(s);
            }else if(s.equals(")")){
                String pop = stack.pop();
                if(pop==null){
                    return false;
                }
            }
        }
        if(stack.size()==0){
            return true;
        }
        return false;
    }
}
