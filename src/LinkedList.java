public class LinkedList<T> {
    public Node head;
    public int n;
    private class Node{
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkedList() {
        this.head=new Node(null,null);
        this.n=0;

    }
    public void clearElement(){
        head.next=null;
        this.n=0;
    }
    public Integer length(){
        return n;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public T get(int i){
        Node n= head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }

        return n.item;
    }
    public void insert(T t){
        Node node = head;
        while(node.next!=null){
            node=node.next;
        }
        Node newNode = new Node(t,null);
        node.next=newNode;
        n++;
    }
    public void insert(int i,T t){
        Node node = head;
        //find i-1
        for(int index=0;index<i-1;index++){
            node=node.next;
        }
        //find i
        Node curr=node.next;
        Node newNode=new Node(t,curr);
        node.next=newNode;
        n++;
    }
    public T remove(int i){
        Node node = head;
        for(int index=0;index<i-1;index++){
            node=node.next;
        }
        Node curr=node.next;
        Node next=curr.next;
        node.next=next;
        n--;
        return curr.item;
    }
    public int indexOf(T t){
        Node node = head;
        for(int i=0;i<n;i++){
            node=node.next;
            if(node.item.equals(t)){
                return i;
            }
        }
        return -1;

    }

}
