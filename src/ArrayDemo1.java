import linear.LinkList;
import linear.SequenceList;
import linear.TwoWayLinkList;

public class ArrayDemo1 {
    public static void main(String[] args) {
        TwoWayLinkList<Integer> sl = new TwoWayLinkList<Integer>();


        //boolean empty = sl.isEmpty();
        //System.out.println(empty);
        sl.insert(3);
        sl.insert(4);
        sl.insert(5);
        sl.insert(0,7);
        int length = sl.length();
        System.out.println(length);
        sl.remove(0);
        length = sl.length();
        System.out.println(length);
        int i = sl.indexOf(3);
        System.out.println(i);
        System.out.println("first item is: "+ sl.getFirst());
        System.out.println("first item is: "+ sl.getLast());
        for(int j: sl){
            System.out.println(j);
        }
        /*
        System.out.println(sl.length());
        Integer remove = sl.remove(1);
        System.out.println(remove+","+sl.length());
        Integer remove1 = sl.remove(1);
        System.out.println(remove1+","+sl.length());
        sl.insert(0,1);
        System.out.println(sl.length());

         */

    }
}
