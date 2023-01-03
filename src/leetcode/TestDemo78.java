package leetcode;
/*290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */

import java.util.HashMap;
import java.util.Map;

public class TestDemo78 {
    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean b = wordPattern(pattern,s);
        System.out.println(b);
    }
    public static boolean wordPattern(String pattern, String s) {
        char[] c = pattern.toCharArray();
        String[] s1 = s.split(" ");
        if(c.length!=s1.length) return false;
        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<c.length;i++){
            if(map.containsKey(c[i])){
                if(!map.get(c[i]).equals(s1[i])){
                    return false;
                }
            }else{
                if(map.containsValue(s1[i])) return false;
                map.put(c[i],s1[i]);
            }
        }
        return true;
    }

}
