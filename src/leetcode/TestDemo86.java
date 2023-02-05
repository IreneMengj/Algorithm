package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestDemo86 {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary=new ArrayList<>();
        dictionary.add("a");
        dictionary.add("b");
        dictionary.add("c");
        String longestWord = findLongestWord(s, dictionary);
        System.out.println(longestWord);
    }
    public static String findLongestWord(String s, List<String> dictionary) {
        String max ="";
        for(String s1:dictionary){
            int n1 = s1.length();
            int n2=max.length();
            if(n2>n1||n2==n1&&max.compareTo(s1)<0){
                continue;
            }
            if(isSub(s1,max)){
                max=s1;
            }
        }
        return max;
    }
    private static boolean isSub(String s,String s1){
        int i=0;
        int j = 0;
        while(i<s.length()&&j<s1.length()){
            if(s.charAt(i)==s1.charAt(j)){
                j++;
            }
            i++;
        }
        return j == s1.length();
    }
}
