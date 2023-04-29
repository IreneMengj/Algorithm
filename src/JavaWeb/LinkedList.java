package JavaWeb;

public class LinkedList<T> {
    public Node head;
    public int n;

    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkedList() {
        this.head = new Node(null, null);
        this.n = 0;

    }
    public Integer length(){
        return n;
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
    public void printNode(Node n){
        Node node=head.next;
        if(node==null){
            return;
        }
        System.out.println(node+" ");
        printNode(node.next);
    }

}
