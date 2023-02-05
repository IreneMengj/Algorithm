package leetcode;

import java.util.Arrays;

public class TestDemo77 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] chars = reverseString(s);
        System.out.println(Arrays.toString(chars));
    }
    public static char[] reverseString(char[] s) {
        String s1 = new String(s);
        StringBuilder sb = new StringBuilder(s1);
        sb = sb.reverse();
        s1= sb.toString();
        for(int i=0;i<s1.length();i++){
            s[i]=s1.charAt(i);
        }
        return s;
    }
}
