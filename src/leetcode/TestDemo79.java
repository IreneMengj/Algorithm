package leetcode;
/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo79 {
    public static void main(String[] args) {
        String s = "Aa";
        s = reverseVowels(s);
        System.out.println(s);
    }
    public static String reverseVowels(String s) {
        char[] c = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> ch = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        for(char chs: c){
            ch.add(chs);
        }
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            char c1 = s.charAt(start);
            char c2 = s.charAt(end);
            if(ch.contains(c1)&&ch.contains(c2)) {
               sb.setCharAt(start,c2);
               sb.setCharAt(end,c1);

                start++;
                end--;
            }else if(ch.contains(c1)&&!ch.contains(c2)){
                end--;
            }else if(ch.contains(c2)&&!ch.contains(c1)){
                start++;
            }else{
                start++;
                end--;
            }
        }
        return sb.toString();
    }
}
