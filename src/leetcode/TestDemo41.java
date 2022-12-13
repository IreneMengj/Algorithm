package leetcode;

public class TestDemo41 {
    public static void main(String[] args) {
        int i = 1231;
        boolean b = reverseInt(i);
        System.out.println(b);
    }
    public static boolean reverseInt(int i){
        String s = String.valueOf(i);
        char[] chars = s.toCharArray();
        int  start = 0;
        int end = chars.length - 1;
        while(start<=end){
            if(chars[start]!=chars[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
