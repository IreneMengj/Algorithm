package datastructure1;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
    int top;
    int maxSize;
    T[] items;
    public ArrayStack(int size){
        this.maxSize=size;
        this.top=-1;
        this.items=(T[]) new Object[maxSize];
    }
    @Override
    public void push(T ele) {
        if(top==maxSize-1){
            reallocate();
        }
        top++;
        items[top]=ele;
    }
    public void reallocate(){
        maxSize*=2;
        items= Arrays.copyOf(items,maxSize);
    }

    @Override
    public T peek() {
        if(top==-1) throw new IndexOutOfBoundsException();
       T value=items[top];
       return value;
    }

    @Override
    public T pop() {
        return null;
    }
}
