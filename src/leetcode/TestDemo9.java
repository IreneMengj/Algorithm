package leetcode;

import java.util.Arrays;

public class TestDemo9 {
    public static void main(String[] args) {
        String s = "a";
        String t="ab";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }
}

