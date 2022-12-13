package linear;

public class Queue<T> {
    private Node head;
    private Node last;
    //the number of elements
    private int N;



    private class Node{
        public T item;
        public Node next;
        public Node(T item, Node next){
            this.item=item;
            this.next=next;
        }
    }
    public Queue(){
        this.head = new Node(null,null);
        this.last=null;
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void enqueue(T t){
        if(last==null){
            last=new Node(t,null);
            head.next=last;
        }else{
            Node oldLast = last;
            last=new Node(t,null);
            oldLast.next=last;
        }
        N++;

    }
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        Node oldFirst = head.next;
        head.next=oldFirst.next;
        N--;
        if(isEmpty()){
            last=null;
        }
        return oldFirst.item;
    }

}
