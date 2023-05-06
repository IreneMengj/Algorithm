package TABA;

public class reverseString {
    public static String reverseString(String s){
        if(s.length()<=1){
            return s;
        }else{
            return reverseString(s.substring(1))+s.charAt(0);
        }
    }
}
