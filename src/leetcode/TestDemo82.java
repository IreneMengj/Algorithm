package leetcode;

public class TestDemo82 {
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        boolean isomorphic = isIsomorphic(s,t);
        System.out.println(isomorphic);

    }
    public static boolean isIsomorphic(String s, String t) {
        int[] array1 = new int[256];
        int[] array2 = new int[256];
        for(int i =0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(array1[sc]!=array2[tc]){
                return false;
            }
            array1[sc]=i+1;
            array2[tc]=i+1;
        }
        return true;
    }
}
