package datastructure1;

import sun.awt.image.ImageWatched;

import javax.xml.stream.events.NotationDeclaration;

public class LinkedList<T> {
    Node head;
    Node last;

    private class Node {
        Node next;
        T element;

        public Node(Node next, T element) {
            this.next = next;
            this.element = element;
        }

        public Node(T element) {
            this.next = null;
            this.element = element;
        }
    }

    public LinkedList() {
        this.head = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(T ele) {
        if (isEmpty()) return false;
        else {
            Node node = head;
            while (node != null) {
                if (node.element == ele) return true;
                node = node.next;
            }
        }
        return false;
    }

    public int size() {
        if (isEmpty()) return 0;
        else {
            int count = 0;
            Node node = head;
            while (node != null) {
                count++;
                node = node.next;
            }
            return count;
        }
    }

    public T remove(T ele) {
        if (contains(ele)) {
            if (head.element == ele) {
                if (size() == 1) {
                    head = new Node(null, null);
                    last = head;
                } else {
                    head = head.next;
                }
            } else {
                Node node = head;
                while (node != null) {
                    if (node.next.element == ele) {
                        Node curr = node.next;
                        node.next = curr.next;
                        return curr.element;
                    }
                    node = node.next;

                }
            }
        }
        return ele;

    }
    public void add(int index, T target){
        if(index>size()||index<0) throw new IndexOutOfBoundsException();
        if(index==0){
            Node oldHead=head;
            head=new Node(oldHead,target);
            if(last==null){
                last=head;
            }
        }else{
            Node node = head;
            for(int i =1;i<index;i++){
                node=node.next;
            }
            if(node.next==null){
                last.next=new Node(null,target);
                last=last.next;
            }else{
                node.next=new Node(node.next,target);
            }

        }
    }
    public void add(T ele){
        if(isEmpty()){
            head=new Node(null,ele);
            last=head;
        }else{
            last.next=new Node(null,ele);
            last=last.next;
        }
    }

    public String toString(){
        String str="";
        Node node = head;
        while(node!=null){
            str+=node.element+", ";
            node=node.next;
        }
        return str;
    }
    public void addBefore(T target, T ele){
        if(isEmpty()) return;
        Node node =head;
        int index=0;
        while(node!=null&&!node.element.equals(target)){
            index++;
            node=node.next;
        }
        add(index,ele);
    }
    public void addAfter(T target,T ele){
        if(isEmpty())return;
        Node node =head;
        int index=0;
        while(node!=null&&!node.element.equals(target)){
            index++;
            node=node.next;
        }
        add(index+1,ele);
    }


            public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(2);
        list.add(6);
        list.add(10);


        //list.add(3,67);
        list.add(0,67);
        list.add(4,4);
        list.addBefore(4,20);
        list.addAfter(20,40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(4));
        System.out.println(list);
    }
}
