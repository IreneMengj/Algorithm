package datastructure1;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(){
        super("there is no element in the Queue");
    }
}
