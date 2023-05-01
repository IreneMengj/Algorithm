package dataStructure;
/*
 This is the node that we are using for binary tree
 we know that we need some type of data
 we need a left node and a right node
 */
public class BTNode<T> {
    protected T element;
    protected BTNode<T> left;
    protected BTNode<T> right;

    public BTNode(T element){
        this.element=element;
    }
}
