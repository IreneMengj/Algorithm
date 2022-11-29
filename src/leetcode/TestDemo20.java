package leetcode;

public class TestDemo20 {
    public static void main(String[] args) {
        String s = s = "is2 sentence4 This1 a3";
        String s1 = sortSentence(s);
        System.out.println(s1);
    }
    public static String sortSentence(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = new String[s1.length];
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s1.length;i++){
            s2[Character.getNumericValue(s1[i].charAt(s1[i].length()-1))-1]=s1[i].substring(0,s1[i].length()-1);

        }
        for(String s3:s2){
            sb.append(s3);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
