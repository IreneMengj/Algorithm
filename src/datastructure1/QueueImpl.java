package datastructure1;

public class QueueImpl<T> implements Queue<T>{
    Node head;
    Node last;
    private class Node{
        Node next;
        T element;

        public Node(Node next, T element) {
            this.next = next;
            this.element = element;
        }

        public Node(T element) {
            this.element = element;
            this.next=null;
        }
    }
    public QueueImpl(){
        this.head=null;
        this.last=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        if(isEmpty())return 0;
        else{
            Node node=head;
            int count =0;
            while(node!=null){
                count++;
                node=node.next;
            }
            return count;
        }
    }

    @Override
    public void enqueue(T ele) {
        if(isEmpty()){
            head=new Node(null,ele);
            last=head;
        }else{
            last.next=new Node(null,ele);
            last=last.next;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty())throw new EmptyQueueException();
        else{
            T value=head.element;
            head=head.next;
            return value;
        }
    }
    public T peek(){
        if(isEmpty()) throw new EmptyQueueException();
        T value=head.element;
        return value;
    }
}
