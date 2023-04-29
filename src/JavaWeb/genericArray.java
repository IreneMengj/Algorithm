package JavaWeb;

public class genericArray<T> {
    private T[] data;
    int size=0;


    public genericArray() {
        data=(T[])new Object[1];
    }

    public genericArray(int n) {
        data=(T[])new Object[n];
    }
    public void add(T element){
        data[size]=element;
        size++;
    }
    public int length(){
        return size;
    }

    public static void main(String[] args) {
        genericArray<Integer> ga=new genericArray<>(2);
        ga.add(10);
        ga.add(30);
        System.out.println(ga.length());
    }
}
