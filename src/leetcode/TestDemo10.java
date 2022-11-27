package leetcode;

import java.util.Arrays;

public class TestDemo10 {
    public static void main(String[] args) {
        String s = "";
        String t = "e";

        char theDifference = findTheDifference(s, t);
        System.out.println(theDifference);
    }
    public static char findTheDifference(String s, String t) {
        if(s==""||s==null){
            return t.charAt(0);
        }
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        char[] c2 = t.toCharArray();
        Arrays.sort(c2);
        for(int i=0;i<s.length();i++){
            if(c2[i]!=c1[i]){
                return c2[i];
            }
        }
        return c2[t.length()-1];
    }
}
