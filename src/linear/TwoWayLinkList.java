package linear;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable<T>{
    private Node head;
    private Node last;
    private int N;

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }
    private class TIterator implements Iterator<T>{
        private Node n;

        public TIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public T next() {
            n=n.next;
            return n.item;
        }
    }

    private class Node{
        public T item;
        public Node pre;
        public Node next;

        public Node(T item, Node pre, Node next){
            this.item=item;
            this.pre = pre;
            this.next= next;
        }

    }
    public TwoWayLinkList(){
        this.head=new Node(null,null,null);
        this.last=null;
        this.N=0;
    }
    public void clear(){
        this.head.next=null;
        this.last=null;
        this.N=0;
    }
    public int length(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.next.item;
    }
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return last.item;

    }
    public void insert(T t){
        //if it is empty
        if(isEmpty()){
            Node newNode = new Node(t, head, null);
            last=newNode;
            head.next=last;

        }
        //if it is not empty
        else{
            Node oldLast=last;
            Node newNode = new Node(t, oldLast, null);
            oldLast.next=newNode;
            last=newNode;
        }
        N++;

    }
    public void insert(int i, T t){
        Node pre = head;
        for(int index=0;index<i;index++){
            pre=pre.next;
        }
        Node curr = pre.next;
        Node newNode = new Node(t, pre, curr);
        pre.next=newNode;
        curr.pre=newNode;
        N++;
    }
    //get item t at index i
    public T get(int i){
        Node n = head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }

    //find the first place whent t comes out
    public int indexOf(T t){
        Node n = head;
        for(int i=0;n.next!=null;i++){
            n=n.next;
            if(n.equals(t)){
                return i;
            }
        }
        return -1;
    }

    public T remove(int i){
        Node pre=head;
        for(int index=0;index<i;index++){
            pre=pre.next;
        }
        Node curr = pre.next;
        Node nextCurr = curr.next;
        pre.next=nextCurr;
        nextCurr.pre=pre;
        N--;
        return curr.item;

    }

}
