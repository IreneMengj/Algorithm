package dataStructure;

import ES6.Car;
import ES6.DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoubleLinkedList<T> {
    Node first;
    Node last;
    private class Node{
        T element;
        Node pre;
        Node next;

        public Node(T element, Node pre, Node next) {
            this.element = element;
            this.pre = pre;
            this.next = next;
        }
        public Node(T element) {
            this.element = element;
            this.pre = null;
            this.next = null;
        }

    }

    public DoubleLinkedList() {
        this.first = null;
        this.last = null;
    }
    @Override
    public String toString(){
        String str="";
        Node node =first;
        int i = size();
        while(node!=null){
            if(node==last){
                str+=node.element;
            }else{
            str+=node.element+", ";}
            node=node.next;
            i--;
        }
        return str;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public boolean contains(T ele){
        if(isEmpty())return false;
        Node node = first;
        while(node!=null){
            if(node.element.equals(ele)) return true;
            node=node.next;
        }
        return false;
    }
    public int size() {
        if(isEmpty()){
            return 0;
        }
            Node node =first;
            int count=0;
            while(node!=null){
                count++;
                node=node.next;
            }
        return count;

    }
    public void add(T ele){
        if(isEmpty()){
            first=new Node(ele,null,null);
            last=first;
        }else{
            last.next=new Node(ele,last,null);
            last=last.next;
        }
    }
    public void prepend(T e) {
        if(isEmpty()) add(e);
        else{
            first=new Node(e,null,first);
            first.next.pre=first;
        }
    }
    public T get(int index){
        if(index==0){
            return first.element;
        }else{
            Node node =first;
            while(index>0){
                node=node.next;
                index--;
            }
            return node.element;
        }
    }
    public void add(int index,T ele) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();}
            if (index == 0) {
                prepend(ele);
            } else {
                Node node = first;
                int i = 0;
                Node pre = node;
                while (node != null) {
                    if (i == index) {
                        pre = node.pre;
                        node = new Node(ele, pre, node);
                        node.next.pre = node;
                        pre.next = node;
                        break;
                    }
                    node = node.next;
                    i++;
                }

            }
        }

    public void addBefore(T target, T elem) {
        if(isEmpty()){
            return;
        }
        if(contains(target)){
            Node node =first;
            Node pre=node;
            while(node!=null){
                if(node.element.equals(target)){
                    pre=node.pre;
                    node=new Node(elem,pre,node);
                    pre.next=node;
                    node.next.pre=node;
                    break;
                }
                node=node.next;
            }
        }else{
            throw new NoSuchElementException();
        }

    }
    public void addAfter(T target, T elem) {

    }
    public T remove(int index){
        return null;
    }
    public T remove(T target) {
        return null;
    }


    public static void main(String [] args){
        DoubleLinkedList<String> linked = new DoubleLinkedList<>();
        linked.add("apple");
        linked.add("Orange");
        linked.add("Banana");
        linked.add("Pear");
        linked.add("Kiwi");
//        System.out.println(linked.size());;
//        System.out.println(linked);
//        System.out.println(linked.get(2));
//        System.out.println(linked.get(9));
//        linked.prepend("haha");
//        System.out.println(linked);
//        linked.add(10,"haha");
//        System.out.println(linked);
        linked.addBefore("Kiwi","rew");
        System.out.println(linked);
    }















}
