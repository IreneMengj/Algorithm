import java.util.ArrayList;
import java.util.Random;

public class LargestNumberArray {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int max=0;
        long start = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            int j = r.nextInt(801) ;
            list.add(j);
            if(j>max){
                max=j;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(max);
        System.out.println(list.toString());
        System.out.println(end-start);
    }
}
