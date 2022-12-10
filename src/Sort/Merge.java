package Sort;

public class Merge {
    //array to assist in merging
    private static Comparable[] assist;
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
    //sort a
    public static void sort(Comparable[] a){
        assist=new Comparable[a.length];
        int start=0;
        int end = a.length-1;
        sort(a,start,end);
    }

    private static void sort(Comparable[] a,int start,int end){
        if(start<=end){
            return;
        }
        //divide into two groups
        //1.from start to mid
        //2.from mid+1 to end
        int mid = start+(end-start)/2;
        sort(a,start,mid);
        sort(a,mid+1,end);
        merge(a,start,mid,end);
    }
    private static void merge(Comparable[] a,int start,int mid,int end){
        //define three pointers
        int i = start;
        int p1 = start;
        int p2 = mid+1;

        //loop and move both p1 and p2
        while(p1<=mid&&p2<=end){
            if(less(a[p1],a[p2])){
                assist[i++]=a[p1++];
            }else {
                assist[i++]=a[p2++];
            }
        }
        //loop when p1 has not finished
        while(p1<=mid){
            assist[i++]=a[p1++];
        }
        //loop when p2 has not finished
        while(p2<=end){
            assist[i++]=a[p2++];
        }
        //copy elements from assistant to original array
        for(int index=start;start<end;index++){
            a[index]=assist[index];
        }
    }
}
