package dataStructure;

import sun.invoke.empty.Empty;

public class QueueImpl<T> implements Queue<T>{
    Node head;
    Node last;

    private class Node{
        T element;
        Node next;

        public Node(T element) {
            this.element = element;
            this.next=null;
        }

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
    public QueueImpl(){
        this.head=null;
        this.last=null;
    }


    public void enqueue(T elem){
        if(isEmpty()) {
            head=new Node(elem,null);
            last=head;
        }else{
            Node oldLast=last;
            last=new Node(elem,null);
            oldLast.next=last;
        }
    }




    //The dequeue removes the object from the collection
    public T dequeue(){
        if(isEmpty()) return null;
        T value=head.element;
        head=head.next;
        return value;
    }

    public boolean isEmpty(){
        return head==null;
    }
    // This method simply views the object
    public T peek(){
        if((isEmpty())){
            return null;
        }else {
            return head.element;
        }
    }
    public int size(){
        int count =0;
        Node node = head;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;
    }
    public String toString(){
        String str="";
        Node node = head;
        while(node!=null){
            str+=node.element+" ,";
            node=node.next;
        }
        return str;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new QueueImpl<>();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }


}
