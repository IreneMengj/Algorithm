package TABA;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.length()==0||s.length()==1){
            return false;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }else{
            return false;
        }
    }
}
