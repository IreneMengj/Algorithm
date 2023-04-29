package dataStructure;

public class LinkedStack<T> implements Stack<T> {
    Node head;
    private class Node{
        public T item;
        public Node next;
        public Node(T item, Node next){
            this.item=item;
            this.next=next;
        }
    }
    public LinkedStack() {
        //this.head=new Node(null,null);
    }
    private boolean isEmpty(){
        return head==null;
    }

    @Override
    public void push(T ele) {
        if(isEmpty()){
            head=new Node(ele,null);
        }else{
            Node oldHead=head;
            head=new Node(ele,oldHead);
        }
    }

    @Override
    public T pop() {
        if(isEmpty()) return null;
        else{
            T value = head.item;
           head=head.next;
           return value;
        }
    }

    @Override
    public T peek() {
        if(isEmpty()) throw new IndexOutOfBoundsException();
        else{
            T value = head.item;
            return value;
        }
    }

    @Override
    public String toString() {
        String str = "TOP";

        Node top = head;
        while (top != null) {
            str += "\n" + top.item;
            top = top.next;
        }
        return str + "\nBOTTOM";
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new LinkedStack<>();
        stack.push(2);
        stack.push(4);
        System.out.println(stack);
    }
}
