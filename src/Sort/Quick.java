package Sort;

public class Quick {
    //compare v and w
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    //exchange elements
    private static void exch(Comparable[] a, int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j]=t;
    }
    public static void sort(Comparable[] a){
        int start=0;
        int end = a.length-1;
        sort(a,start,end);
    }
    public static void sort(Comparable[] a,int start,int end){
        if(start>=end){
            return;
        }
        //partition is the index after grouping
        int partition = partition(a,start,end);
        sort(a,start,partition-1);
        sort(a,partition+1,end);


    }
    //the method to group
    public static int partition(Comparable[] a,int start,int end){
        Comparable key = a[start];
        int left =start;
        int right = end+1;
        while(true){
            while(less(key,a[--right])){
                if(right==start){
                    break;
                }
            }
            while(less(a[++left],key)){
                if(left==end){
                    break;
                }
            }
            if(left>=right){
                break;
            }else{
                exch(a,left,right);
            }
        }
        exch(a,start,right);
        return right;
    }


}
