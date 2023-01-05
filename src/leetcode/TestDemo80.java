package leetcode;
/*9. Palindrome Number
Given an integer x, return true if x is a
palindrome
, and false otherwise.
 */

public class TestDemo80 {
    public static void main(String[] args) {
        int x=121;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);

    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);
        sb=sb.reverse();
        String s1 = sb.toString();
        if(s.equals(s1)) return true;
        return false;
    }
}
