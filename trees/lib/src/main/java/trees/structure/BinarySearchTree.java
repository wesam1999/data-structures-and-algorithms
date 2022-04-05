package trees.structure;

import trees.data.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree <T extends Comparable<T>> extends BinaryTree<T>{
    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }

    private Node root;
    private int size;

    public void Add(T data) {
        if (contains()) {
            root = new Node((Integer) data);
            size++;
        } else {
            AddIn(data, root);
        }
    }

    private void AddIn(T data, Node root) {
if (root==null){
    root.setData(String.valueOf(new Node<>((Integer) data)));
return;
}
Queue<Node> q= new Queue<Node>();

        while (!q.isQueueEmpty()) {

root=q.dequeue();
if (root.getLeftNode()==null){
    root.setLeftNode(new Node((Integer) data));
break;
}else {
    q.enqueue(root.getLeftNode());
}
if (root.getRightNode()==null){
    root.setRightNode(new Node((Integer) data));
    break;
}else {
    q.enqueue(root.getRightNode());
}
        }

    }




//    public void traverse(TraversalOrder order) {
//        switch (order) {
//            case INORDER:
//                inOrder(root);
//                break;
//            case PREORDER:
//                preOrder(root);
//                break;
//            case POSTORDER:
//                postOrder(root);
//                break;
//            default:
//        }
//    }




    public boolean contains() {
        return root == null;
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
    public List<String> fizzBuzz(List<Integer> array){
       List<String> arr = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%3 ==0){
arr.add("Fizz");
            }
            if (array.get(i)%5 ==0){
arr.add("Buzz");
            }
            if (array.get(i)%3 ==0&&array.get(i)%5==0){
                arr.add("FizzBuzz");
            }
            if (array.get(i)%3 ==1&&array.get(i)%5==1){
                arr.add(array.get(i).toString());            }
        }




return arr;
    }
    public List<Integer> extractValues(Node n) {
        List<Integer> result = new ArrayList<>();
        if (n.getLeftNode() != null) {
            result.addAll(extractValues(n.getLeftNode()));
        }

        if (n.getRightNode() != null) {
            result.addAll(extractValues(n.getRightNode()));
        }

        result.add((Integer) n.getData());
        System.out.println(result.size());

        return result;
    }
}