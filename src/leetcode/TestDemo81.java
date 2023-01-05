package leetcode;
/*
409. Longest Palindrome
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 */
import java.util.HashMap;
import java.util.Set;

public class TestDemo81 {
    public static void main(String[] args) {
        String s = "a";
        int i = longestPalindrome(s);
        System.out.println(i);
    }
    public static int longestPalindrome(String s) {
        int length=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Character> characters = map.keySet();
        for(Character i:characters){
            if(map.get(i)%2==0){
                length+=map.get(i);
            }else{
                length+=map.get(i)-1;
            }
        }
        if(s.length()!=length){
            length+=1;
        }
        return length;
    }
}
