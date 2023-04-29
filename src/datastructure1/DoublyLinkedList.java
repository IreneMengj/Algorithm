package datastructure1;

public class DoublyLinkedList<T extends Car> {
    Node head;
    Node last;
    private class Node{
        Node successor;
        Node previous;
        T element;
        public Node(T element){
            this.element=element;
            this.successor=null;
            this.previous=null;
        }

        public Node(Node successor, Node previous, T element) {
            this.successor = successor;
            this.previous = previous;
            this.element = element;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.last = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    //this method is to iterate through the list and on each movement add 1 to the counter. when it reaches
    //the end, stop and return counter;
    public int size(){
        if(isEmpty())return 0;
        else{
            Node node = head;
            int count=0;
            while(node!=null){
                count++;
                node=node.successor;
            }
            return count;
        }
    }
    public boolean contains(T ele){
        if(isEmpty()) return false;
        else{
            Node node = head;
            while(node!=null){
                if(node.element==ele) return true;
                node=node.successor;
            }
        }
        return false;
    }
    public void add(T ele){
        if(isEmpty()){
            head=new Node(null,null,ele);
            last=head;
        }else{
            last.successor=new Node(null,last,ele);
            last=last.successor;
        }
    }
    public String toString(){
        String str="";
        Node node = head;
        while(node!=null){
            if(node.successor==null) str+=node.element;
            else{str+=node.element+" ,";}
            node=node.successor;
        }
        return str;
    }
    public void add(int index,T ele){
        if(index>size()||index<0)throw new IndexOutOfBoundsException();
        if(index==0){
            head=new Node(head,null,ele);
        }else{
            Node node = head;
            for(int i=1;i<index;i++){
                node=node.successor;
            }
            Node oldSuccessor= node.successor;
            node.successor=new Node(node.successor,node.previous,ele);
            oldSuccessor.previous=node.successor;
        }
    }
    public void addBefore(T target,T ele){
        if(isEmpty())return;
        int index=0;
        Node node = head;
        while(node!=null&&!node.element.equals(target)){
            index++;
            node=node.successor;
        }
        add(index,ele);
    }
    public void addAfter(T target,T ele){
        if(isEmpty()) return;

    }
    public T remove(T ele){
        if(contains(ele)){
            if(head.element==ele){
                if(size()==1){
                    head=null;
                    last=head;
                }else{
                    head=head.successor;
                }
            }else{
                Node node = head;
                while(node!=null){
                    if(node.successor.element==ele){
                        Node curr= node.successor;
                        node.successor=curr.successor;
                        node.successor.previous=node;
                        return curr.element;
                    }
                    node=node.successor;
                }
            }
        }
        return ele;
    }
    public void prepend(T ele){
        if(isEmpty()) head=new Node(null,null,ele);
        else{
            Node oldHead = head;
            head=new Node(oldHead,null,ele);
            oldHead.previous=head;
        }
    }
    public T get(int index){
        if(index>size()||index<0) throw new IndexOutOfBoundsException();
        if(index==0) return head.element;
        else{
            Node node = head;
            for(int i=0;i<index;i++){
                node=node.successor;
            }
            return node.element;
        }
    }
    public T remove(int index){
        if(index>size()||index<0) throw new IndexOutOfBoundsException();
        if(index==0){
                Node oldHead=head;
                head=oldHead.successor;
                //head.previous=null;
                return oldHead.element;
            }
        else{
            Node node = head;
            for(int i=1;i<index;i++){
                node=node.successor;
            }
            Node curr=node.successor;
            node.successor=node.successor.successor;
            node.successor.previous=node;
            return curr.element;
        }

    }


    public static void main(String[] args) {
        DoublyLinkedList<Car> list= new DoublyLinkedList<>();
        Car car = new Car("haha",234);
        Car car1 = new Car("haha1",234);
        list.add(car);
        System.out.println(list);
//        list.add(car1);
//        System.out.println(list);
//        list.add(1,new Car("hehe",123));
//        System.out.println(list.size());
//        System.out.println(list);
//        list.addBefore(car,new Car("yeye",30));
//        System.out.println(list);
//        System.out.println(list.remove(car));
//        System.out.println(list);
//        System.out.println(list.get(1));
//        list.prepend(new Car("hehehee",423));
//        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);

    }
}
