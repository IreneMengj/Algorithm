package dataStructure;

public interface List<T> {
    public boolean isEmpty();
    public int size();
    public String toString();
    //This is to add the element to a desired position
    public void add(int index,T el);
    public boolean contains(T el);
    public void addBefore(T target,T element);
    public void addAfter(T target,T element);
    public T remove(T target);
}
