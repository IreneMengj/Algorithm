package linear;

import sun.tools.tree.Node;

import java.util.Iterator;

public class Stack<T> {
    private Node head;
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
    public Stack(){
        this.head=new Node(null,null);
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    //push onto stack
    public void push(T t){
        Node oldFirst = head.next;
        Node newNode = new Node(t, null);
        head.next=newNode;
        newNode.next=oldFirst;
        N++;
    }

    public T pop(){
        Node oldFirst = head.next;
        if(oldFirst==null){
            return null;
        }
        head.next=oldFirst.next;
        N--;
        return oldFirst.item;
    }

}
