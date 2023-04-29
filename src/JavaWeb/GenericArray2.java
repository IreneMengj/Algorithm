package JavaWeb;

import java.util.Arrays;

public class GenericArray2<T extends Comparable<T>> {
    private T[] data;
    int size=0;

    public GenericArray2() {
        data=(T[])new Comparable[50];
    }
    public GenericArray2(int n) {
        data=(T[])new Comparable[n];
    }
    public void add(T element){
        data[size]=element;
        size++;
    }
    public int length(){
        return size;
    }
    public String printGe(){
        return Arrays.toString(data);
    }
    public boolean search(T element){
        boolean found = false;
        int j=0;
        while(j<size&& !found){
            if(data[j].compareTo(element)==0){
                found=true;
            }
            j++;
        }
        return found;
    }
    public void bubbleSort(){
        for(int i=0;i<size;i++){
            for(int j=1;j<size-i;j++){
                if(data[j-1].compareTo(data[j])>0){
                    T temp=data[j-1];
                    data[j-1]=data[j];
                    data[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
    public void selectionSort(){
        for(int i=0;i<size;i++){
            int smallestIndex=i;
            for(int j=i+1;j<size;j++){
                if(data[j].compareTo(data[smallestIndex])<0){
                    smallestIndex=j;
                }
            }
            T temp=data[i];
            data[i]=data[smallestIndex];
            data[smallestIndex]=temp;
        }
        System.out.println(Arrays.toString(data));
    }
    public void insertionSort(){

    }

    public static void main(String[] args) {
        GenericArray2<Integer> ge=new GenericArray2();
        ge.add(3);
        ge.add(561);
        ge.add(4);
        ge.add(34);
        ge.add(39);
        ge.add(56);
        ge.add(6);
        boolean search = ge.search(3);
        String s = ge.printGe();
        //System.out.println(s);
        //System.out.println(search);
        //ge.bubbleSort();
        ge.selectionSort();
    }
}
