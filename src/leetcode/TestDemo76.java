package leetcode;
/*
125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.


 */

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
