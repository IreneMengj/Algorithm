package dataStructure;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T>{
    protected BTNode<T> root;
    @Override
    public void insert(T ele) {
        if(isEmpty()){
            root=new BTNode<>(ele);
        }else{
            insertNode(ele,root);
        }
    }
    private void insertNode(T ele, BTNode<T> current){
        if(ele.compareTo(current.element)==-1){
            if(current.left==null){
                current.left=new BTNode<>(ele);
            }else{
                insertNode(ele,current.left);
            }
        }else{
            if(current.right==null){
                current.right=new BTNode<>(ele);
            }else{
                insertNode(ele,current.right);
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(BTNode<T> current){
        if(current==null){
            return;
        }
        inOrder(current.left);
        inOrder(current.right);
    }

    @Override
    public int size() {
        return size(root);
    }
    private int size(BTNode<T> current){
        if(current==null){
            return 0;
        }else{
            return 1+size(current.left)+size(current.right);
        }
    }


    @Override
    public T findMax() {
        if(isEmpty()){
            return null;
        }else{
            return findMax(root);
        }
    }

    private T findMax(BTNode<T> current){
        if(current.right==null){
            return current.element;
        }else{
            return findMax(current.right);
        }
    }

    @Override
    public T findMin() {
        if(isEmpty()){
            return null;
        }else{
            return findMin(root);
        }
    }
    private T findMin(BTNode<T> current){
        if(current.left==null){
            return current.element;
        }else{
            return findMin(current.left);
        }
    }

    @Override
    public boolean contains(T ele) {
        return contains(ele,root);
    }
    private boolean contains(T element,BTNode<T> current){
        if(current==null){
            return false;
        }
        if(element.compareTo(current.element)==0){
            return true;
        }else if(element.compareTo(current.element)==-1){
            return contains(element,current.left);
        }else{
            return contains(element,current.right);
        }
    }

    @Override
    public boolean remove(T ele) {
        BTNode<T> toRemove = findNode(ele);
        if(toRemove==null){
            return false;
        }
        BTNode<T> parent=findParent(ele);






        return false;
    }
    private BTNode<T> findNode(T ele){
        return findNode(ele,root);
    }
    private BTNode<T> findNode(T element,BTNode<T> current){
        if(current==null){
            return null;
        }
        if(element.compareTo(current.element)==-1){
            return findNode(element,current.left);
        }else{
            return findNode(element,current.right);
        }
    }
    private BTNode<T> findParent(T element){
        return findParent(element,root);
    }
    private BTNode<T> findParent(T element,BTNode<T> current){
        if(element.equals(root.element)){
            return null;
        }
        if(element.compareTo(current.element)==-1){
            if(current.left==null){
                return null;
            }else if(element.compareTo(current.left.element)==0){
                return current;
            }else{
               return findParent(element,current.left);
            }
        }else{
            if(current.right==null){
                return null;
            }else if(element.compareTo(current.right.element)==0){
                return current;
            }else{
                return findParent(element,current.right);
            }
        }
    }
}
