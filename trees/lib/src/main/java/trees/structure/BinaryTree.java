package trees.structure;

import trees.data.Node;

import java.util.ArrayList;
import java.util.List;


public class BinaryTree <T extends Comparable<T>> {

    private Node root;

    public Node getRoot() {
        return root;
    }
    private void printNode(Node<T> node) {
        // implement this
    }
    private void inOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        inOrder(treeNode.getLeftNode());

        printNode(treeNode);

        inOrder(treeNode.getRightNode());
    }
    private void preOrder(Node<T> treeNode){
        if (treeNode == null) {
            return;
        }
        printNode(treeNode);
        preOrder(treeNode.getLeftNode());
        preOrder(treeNode.getRightNode());


    }
    private List<Node<T>> postOrder(Node<T> treeNode){
        if (treeNode == null) {
            return null;
        }
        postOrder(treeNode.getLeftNode());
        postOrder(treeNode.getRightNode());
        printNode(treeNode);
        List<Node<T>> list=new ArrayList<Node<T>>();
        list.add(treeNode);
return list;
    }



}
