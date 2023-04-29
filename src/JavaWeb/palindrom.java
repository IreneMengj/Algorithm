package JavaWeb;

public class palindrom {
    public static void main(String[] args) {
        boolean b = palindrome("cacac");
        System.out.println(b);
    }
    public static boolean palindrome(String s){
        if(s.length()<=1){
            return true;
        }else{
            char c = s.charAt(0);

            char c1 = s.charAt(s.length() - 1);
            if(c!=c1){
                return false;
            }else{
                String remaining = s.substring(1,s.length()-1);
                return palindrome(remaining);
            }
        }

    }
}
