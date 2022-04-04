package trees.structure;

import trees.data.BinaryNode;
import trees.data.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class BinarySearchTree <T extends Comparable<T>> {
    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }

    private Node<T> root;
    private int size;

    public void Add(T data) {
        if (isTreeEmpty()) {
            root = new BinaryNode<>(data);
            size++;
        } else {
            AddIn(data, root);
        }
    }

    private void AddIn(T data, Node<T> root) {

    }

    public void traverse(TraversalOrder order) {
        switch (order) {
            case INORDER:
                inOrder(root);
                break;
            case PREORDER:
                preOrder(root);
                break;
            case POSTORDER:
                postOrder(root);
                break;
            default:
        }
    }

    private void inOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        inOrder(treeNode.getLeftNode());

        printNode(treeNode);

        inOrder(treeNode.getRightNode());
    }

    private void preOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeftNode());

        preOrder(treeNode.getRightNode());
    }

    private void postOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeftNode());

        postOrder(treeNode.getRightNode());

        printNode(treeNode);
    }

    private void printNode(Node<T> node) {
        // implement this
    }

    public int size() {
        return size;
    }

    public boolean isTreeEmpty() {
        return root == null;
    }

    public boolean search(T searchTerm) {
        if (isTreeEmpty()) {
            return false;
        } else {
            return searchHelper(searchTerm, root);
        }
    }

    private boolean searchHelper(T searchTerm, Node<T> root) {
        // implement this

        return false;
    }

    public int maxValue(Node node) {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = (int) node.getData();
        int lres = maxValue(node.getLeftNode());
        int rres = maxValue(node.getRightNode());

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;

    }
    private int V;
    private LinkedList<Integer> adj[];
    public int treeBreadthFirst(int binaryTree) {

        boolean visited[] = new boolean[V];


        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[binaryTree] = true;
        queue.add(binaryTree);

        while (queue.size() > 0) {
            binaryTree = queue.poll();
            System.out.print(binaryTree + " ");


            Iterator<Integer> it = adj[binaryTree].listIterator();
            while (it.hasNext() == true) {
                int n = it.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);

                }
            }
        }


        return binaryTree;
    }
}