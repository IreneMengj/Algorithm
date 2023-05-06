package datastructure1;

public interface BinaryTree<T extends Comparable<T>> {
    public void insert(T elem);
    public boolean isEmpty();
    public void inOrder();
    public int size();
    public T findMax();
    public T findMin();
    public boolean contains(T element);
    public boolean remove(T element);
}
