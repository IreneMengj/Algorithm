package Sort;

public class Selection {
    // sort array a
    public static void sort(Comparable[] a){
        for(int i =0;i<a.length-1;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if (greater(a[min],a[j]))
                {
                   min=j;
                }


            }
            exch(a,i,min);
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
