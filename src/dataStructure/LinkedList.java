package dataStructure;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private class Node{
        T element;
        Node next;

        public Node(T ele,Node n){
            element=ele;
            next=n;
        }
        public Node(T ele){
            element=ele;
            next=null;
        }
    }
    private Node first;
    private Node last;

    public LinkedList(Node first, Node last) {
        this.first = first;
        this.last = last;
    }
    public LinkedList(){
        first=null;
        last=null;
    }
    // Check to see if the linkedlist is empty.
    //The linnkedlist must be empty  if first is null!
    public boolean isEmpty() {
        return first==null;
    }
    // we need to iterate through the LinkedList and on each
    //movement we add 1 to the counter. We should stop when we reach the end, i.e. when the current is null
    public int size(){
        if(first==null){
            return 0;
        }
        int count=0;
        Node node=first;
        while(node!=null){
            node=node.next;
            count++;
        }
        return count;
    }
    @Override
    public String toString(){
        if(first==null){
            return null;
        }
        String str="";
        Node node = first;
        while(node!=null){
            if(node.next==null){
                str+=node.element;
            }else{
            str+= node.element+", ";}
            node=node.next;
        }
        return str;
    }
//    public T remove(T el){
//        if(first==null){
//            return null;
//        }
//        Node node = first;
//        while(node!=null){
//            if(node.element.equals(el)){
//
//            }
//            node=node.next;
//        }
//
//    }
    public boolean contains(T el){
        if(first==null){
            return false;
        }
        Node node = first;
        while(node!=null){
            if(node.element.equals(el)){
                return true;
            }
            node=node.next;
        }
        return false;
    }
    public T remove(T el){
        T found = el;
        if(contains(el)){
            if(first.element==el){
                if(size()==1){
                    found= first.element;
                    first=null;
                }else {
                    first=first.next;
                }
                return found;
            }
            Node current = first;
            Node pre=current;
            while (current!=null){
                if(current.next.element==el){
                    pre=current;
                    break;
                }
                current=current.next;
            }
            found=pre.next.element;
            pre.next=pre.next.next;
            if(pre.next==null){
                last=pre;
            }
        }else{
            throw new NoSuchElementException();
        }
        return found;
    }

    public void add(int index, T el){
        if(index < 0 || index > size())throw new IndexOutOfBoundsException();
        if(index==0){
            first = new Node(el, first);
            if(last==null){
                last=first;
            }
        }else {
            Node node = first;
            for(int i=1;i<index;i++){
                node=node.next;
            }
            node.next=new Node(el,node.next);
            if(node.next.next==null){
                last=node.next;
            }
        }
    }
    public void add(T el){
        if(isEmpty()){
            first=new Node(el,null);
            last=first;
        }else{
            last.next = new Node(el);
            last = last.next;
        }
    }
    /*
  This method adds an element before a target element
  We need to find the element...
*/
    public void addBefore(T target, T elem) {
        if(isEmpty()){
            return;
        }
        if(contains(target)){
            if(first.element==target){
                first=new Node(elem,first);
            }else{
           Node node = first;
           Node pre=node;
           while(node!=null){
               if(node.next.element.equals(target)){
                   pre=node;
                   break;
               }
               node=node.next;
           }
           pre.next=new Node(elem,pre.next);
           if(pre.next.next==null){
               last=pre.next;
           }}
        }else{
            throw new NoSuchElementException();
        }
    }
    public void addAfter(T target, T elem) {
        if(isEmpty()){
            return;
        }
        if(contains(target)){
            if(first.element==target){
                first.next=new Node(elem,first.next);
            }else{
                Node node = first;
                while(node!=null){
                    if(node.element.equals(target)){
                        node.next=new Node(elem,node.next);
                        if(node.next.next==null){
                            last=node.next;
                        }
                        break;
                     }
                    node=node.next;
        }}}else{
            throw new NoSuchElementException();
        }
    }


    public static void main(String [] args){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("apple");
        linked.add("Orange");
        linked.add("Banana");
        linked.add("Pear");
        linked.add("Kiwi");
//        System.out.println("The sie of the linked list is :: "+linked.size());
//        System.out.println(linked);
//        System.out.println("---------------------------");
////        linked.remove("kiwi");
////        System.out.println(linked);
////        System.out.println("---------------------------");
//        linked.addBefore("apple","haha");
//        System.out.println(linked);
        linked.addAfter("Orange","ki");
        System.out.println(linked);
    }


}
