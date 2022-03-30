package trees.structure;

import trees.data.BTNode;

import java.util.LinkedList;

public class BinaryTree {

    private BTNode root;

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public void preOrderTraversalLoop() {
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);

            BTNode node;
            while (!queue.isQueueEmpty()) {
                node = queue.dequeue();
                System.out.print(node.getData() + " , ");
                if (node.getLeft() != null) {
                    queue.enqueue(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.enqueue(node.getRight());
                }
            }
        } else {
            System.out.println("the tree is empty");
        }
    }

    public void inordeTraversalloop() {
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);
            levelOrderTraversalRecursive(queue);
        } else {
            System.out.println("the tree is empty ");
        }
    }

    private void postorderTraversalloop(Queue<BTNode> queue) {

    }
}
