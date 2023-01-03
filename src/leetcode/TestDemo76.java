package leetcode;

public class TestDemo76 {
    public static void main(String[] args) {
        String s = " A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(String s) {
        if(s.length()==1) return true;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isDigit(c)){
                sb.append(c);
            }
        }
        s=sb.toString();
        sb = sb.reverse();
        String reverse = sb.toString();
        if(s.equalsIgnoreCase(reverse)){
            return true;
        }
        return false;
    }
}
