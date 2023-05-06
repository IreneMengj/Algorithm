package datastructure1;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T> {
    protected BTNode<T> root;

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    @Override
    public void insert(T elem) {
        if (isEmpty()) {
            root = new BTNode<>(elem);
        } else {
            insert(root, elem);
        }
    }

    private void insert(BTNode<T> node, T element) {
        if (element.compareTo(node.element) == -1) {
            if (node.left == null) {
                node.left = new BTNode<>(element);
            } else {
                insert(node.left, element);
            }
        } else {
            if (node.right == null) {
                node.right = new BTNode<>(element);
            } else {
                insert(node.right, element);
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(BTNode<T> node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
    }


    @Override
    public int size() {
        return size(root);
    }

    private int size(BTNode<T> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    @Override
    public T findMax() {
        if (isEmpty()) {
            return null;
        } else {
            return findMax(root);
        }
    }

    private T findMax(BTNode<T> node) {
        if (node.right == null) {
            return node.element;
        } else {
            return findMax(node.right);
        }
    }

    @Override
    public T findMin() {
        return findMin(root);
    }

    private T findMin(BTNode<T> node) {
        if (node.left == null) {
            return node.element;
        } else {
            return findMin(node.left);
        }
    }


    @Override
    public boolean contains(T element) {
        if (isEmpty()) {
            return false;
        } else {
            return contains(root, element);
        }
    }

    private boolean contains(BTNode<T> node, T element) {
        if (element.compareTo(node.element) == 0) {
            return true;
        } else if (element.compareTo(node.element) == -1) {
            return contains(node.left, element);
        } else {
            return contains(node.right, element);
        }
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> numbers = new BinarySearchTree<>();
        numbers.insert(3);
        numbers.insert(4);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.findMin());
    }
}
