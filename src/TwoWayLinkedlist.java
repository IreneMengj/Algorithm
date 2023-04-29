public class TwoWayLinkedlist<T> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        public Node pre;
        public Node next;
        public T item;

        public Node(Node pre, Node next, T item) {
            this.pre = pre;
            this.next = next;
            this.item = item;
        }
    }


    public TwoWayLinkedlist(){
        this.first=new Node(null,null,null);
        this.last=null;
        this.N=0;
    }
    public void clear(){
        this.first.next=null;
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
        return first.next.item;
    }
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return last.item;
    }
    public void insert(T t){
        if(isEmpty()){
            Node newNode=new Node(null,first,t);
            last=newNode;
            first.next=last;
        }else{
            Node oldLast=last;
            Node newNode=new Node(oldLast,null,t);
            oldLast.next=newNode;
            last=newNode;
        }
        N++;
    }
    public void insert(int i,T t){
        Node node=first;
        for(int j=0;j<i;j++){
            node=node.next;
        }
        Node curr=node.next;
        Node newNode=new Node(node,curr,t);
        node.next=newNode;
        curr.pre=newNode;
        N++;
    }
    public T get(int i){
        Node node=first.next;
        for(int index=0;index<i;index++){
            node=node.next;
        }
        return node.item;
    }
    public int indexOf(T t){
        Node node=first;
        for(int i=0;i<N;i++){
            node=node.next;
            if(node.item.equals(t)){
                return i;
            }
        }
        return -1;
    }
    public T remove(int i){
        Node node=first;
        for(int j=0;j<i;j++){
            node=node.next;
        }
        Node curr=node.next;
        Node next=curr.next;
        node.next=next;
        next.pre=node;
        N--;
        return curr.item;
    }
}
