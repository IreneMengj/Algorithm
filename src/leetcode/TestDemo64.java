package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TestDemo64 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        String s1 = restoreString(s, indices);
        System.out.println(s1);
    }
    public static String restoreString(String s, int[] indices) {
        StringBuffer sb = new StringBuffer();
        List<Character> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        for(int i =0;i<indices.length;i++){
            list.set(indices[i],s.charAt(i));
        }
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
