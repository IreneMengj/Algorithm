package datastructure1;

public class LinkedStack<T> implements Stack<T>{
    Node head;

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

    public LinkedStack() {
        this.head=null;

    }
    public boolean isEmpty(){
        return head==null;
    }

    @Override
    public void push(T ele) {
        if(isEmpty()){
            head=new Node(null,ele);
        }else{
            head=new Node(head,ele);
        }
    }

    @Override
    public T peek() {
        if(isEmpty()) return null;
        else{
                return head.element;
            }
        }



    @Override
    public T pop() {
        if(isEmpty()) return null;
        else{
            T value=head.element;
            head=head.next;
            return value;
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new LinkedStack<>();
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
