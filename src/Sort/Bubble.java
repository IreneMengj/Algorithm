package Sort;

public class Bubble {
    // sort array a
    public static void sort(Comparable[] a){
        for(int i =a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if (greater(a[j],a[j+1]))
                {
                    exch(a,j,j+1);
                }
            }
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
