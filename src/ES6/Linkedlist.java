package ES6;

public class Linkedlist<T>{
    private Node<T> first;
    private Node<T> last;
    private class Node<T>{
        //instance variables
        T element;
        Node<T> next;

        //Constructor
        //We need two constructors
        public Node(T el, Node<T> n){
            element = el;
            next = n;
        }

        // The second constructor is needed when we don't have a Node to point to
        public Node(T el){
            element = el;
            next = null;
        }
    }

    public Linkedlist(){
        first = null;
        last = null;
    }

    //Test to see if the linkedlist is empty
    public boolean isEmpty(){
        return first == null;
    }

    //Calculate the number of elements in the linkedlist
    public int size(){
        int count = 0;
        Node<T> current = first;
        //we need a loop to keep moving through our linkedlist
        while(current !=null){
            count++;
            current = current.next;
        }
        return count;
    }

    //method to add an element into the linkedlist
    public void add(T el){
        if(isEmpty()){
            //if its empty do something
            first = new Node<T>(el);
            last = first;
        }else{
            //there is something in the list we need to
            //add at the end of the list
            last.next = new Node<T>(el);
            last = last.next;
        }

    }
    //remove all elements
    public void clear(){

        first=null;
        System.out.println("all elements have been removed");
        //first.next=null;
    }
    //remove first element
    public void removeFirst(){
        try{
            first=first.next;
        }catch (NullPointerException e){
            System.out.println("No elements in the list.Please add first");
        }
    }
    public void removeLast(){
        try{
            Node<T> current = first;
           for(int i=1;i<size()-1;i++){
               current=current.next;
           }
           current.next=null;
           last=current;
        }catch (NullPointerException e){
            System.out.println("No elements in the list.Please add first");
        }
    }
    public void printLinked(){
        try{
            Node<T> current = first;
            while(current!=null){
                if(current.next==null){
                    System.out.println(current.element);
                }else{
                System.out.print(current.element+",");}
                current=current.next;
            }

        }catch (NullPointerException e){
            System.out.println("No elements in the list.Please add first");
        }

    }

    public static void main(String []args){
        Linkedlist<String> linked = new Linkedlist<>();
        linked.add("apple");
        linked.add("Orange");
        linked.add("haha");
        System.out.println("There are : "+linked.size()+" items in the linkedlist");
        //linked.clear();
        //System.out.println("There are : "+linked.size()+" items in the linkedlist");
        //linked.removeFirst();
        //System.out.println("There are : "+linked.size()+" items in the linkedlist");
        linked.removeLast();
        linked.removeLast();
        System.out.println("There are : "+linked.size()+" items in the linkedlist");
        linked.printLinked();
    }

}
