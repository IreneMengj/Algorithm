package Sort;

public class Shell {
    // sort array a
    public static void sort(Comparable[] a){
        //decide the initial value of increment h according to the length of a
        int h = 1;
        while(h<a.length/2){
            h=2*h+1;
        }
        while(h>=1){

        }
            
    }

    //check whether v is greater than w
    private static boolean greater(Comparable v, Comparable w){

        return v.compareTo(w)>0;
    }
    //exchange place of element i and j
    private static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
