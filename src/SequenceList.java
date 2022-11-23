import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{
    //declare variables
    private T[] array;
    private int N;
    //constructor
    public SequenceList(int capacity){
        this.array=(T[])new Object[capacity];
        this.N=0;
    }
    //clear array
    public void clear(){
        this.N=0;
    }
    //check whether the array is empty
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }
    //get element by index
    public T getByIndex(int i){
        return array[i];
    }

    //append element
    public void insert(T t){
        if(N==array.length){
            resize(2* array.length);
        }
        array[N++]=t;

    }

    //insert element to certain place
    public void insert(int i, T t){
        if(N==array.length){
            resize(2* array.length);
        }
        N++;
        for(int index=i;index<N;index++){

            array[index+1]=array[index];
        }

        array[i]=t;
    }

    //remove element
    public T remove(int i){

        T current = array[i];
        for(int index=i; index<N-1;index++){
            array[index]=array[index+1];
        }
        N--;
        if(N<array.length/4){
            resize(array.length/2);
        }
        return current;
    }

    //get the index of an element
    public int indexOf(T t){
        for(int i=0;i<N;i++){
            if(array[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    public void resize(int newSize){
        T[] temp = array;
        array=(T[])new Object[newSize];
        for(int i=0;i<N;i++){
            array[i]=temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private int cusor;
        public SIterator(){
            this.cusor=0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return array[cusor++];

        }
    }


}
