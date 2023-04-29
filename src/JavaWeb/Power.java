package JavaWeb;

public class Power {
    public static void main(String[] args) {
        //System.out.println(powerRecursive(3,2));
        System.out.println(powerIterative(2,4));
    }
    public static int powerRecursive(int x, int y){
        if(y==0){
            return 1;
        }
        return x*powerRecursive(x,y-1);
    }

    public static int powerIterative(int x, int y){
        int temp=x;
        while(y>1){
            x=x*temp;
            y--;
        }
        return x;
    }
}
