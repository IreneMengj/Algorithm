package dataStructure;

public interface BinaryTree<T extends Comparable<T>> {

    /**
     * This method will insert an element into the tree
     */
    public void insert(T ele);

    /**
     * this method return true if there are no nodes in the tree otherwise it will be false
     * @return
     */
    public boolean isEmpty();

    /**
     * elements in the ascending order of their values
     */
    public void inOrder();

    /**
     * return the number of nodes in this tree
     * @return
     */
    public int size();

    /**
     * return the max element among tree nodes
     * @return
     */
    public T findMax();

    /**
     * return the min element among tree nodes
     * @return
     */
    public T findMin();

    /**
     * return true if the element can be found in the tree
     * @param ele
     * @return
     */
    public boolean contains(T ele);

    /**
     * remove the node which stores the ele from the tree
     * @param ele
     * @return
     */
    public boolean remove(T ele);


}
