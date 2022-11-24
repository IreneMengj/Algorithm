package linear;


import sun.tools.tree.Node;

public class LinkList<T> {
    private Node head;
    private int N;

    private class Node{
        T item;
        Node next;
        public Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    public LinkList(){
        this.head=new Node(null,null);
        this.N=0;
    }
    public void clear(){
        head.next=null;
        this.N=0;
    }
    public int length(){return N;}
    public boolean isEmpty(){
        return N==0;
    }
    public T get(int i){
        Node n = head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }
    //insert t at last
    public void insert(T t){
        //1.find the last node
        Node n = head;
        while (n.next!=null){
            n=n.next;
        }
        //2.create new node and save element t
        Node newNode = new Node(t,null);
        //3.point to the new last node
        n.next=newNode;
        //4.N++
        N++;
    }
    //insert t at certain place
    public void insert(int i,T t){
        //find the node at i-1
        Node pre = head;
        for(int index=0; index<i;i++){
            pre=pre.next;
        }
        //find the node at i
        Node curr = pre.next;
        //create new node
        Node newNode = new Node(t,curr);
        pre.next=newNode;
        //N++
        N++;
    }
    public T remove(int i){
        //fin
        return null;
    }


}
