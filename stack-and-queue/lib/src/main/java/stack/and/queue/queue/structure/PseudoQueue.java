package stack.and.queue.queue.structure;

import stack.and.queue.queue.data.QueueNode;
import stack.and.queue.queue.structure.Interface.QueueInterface;

import java.util.Stack;

public class PseudoQueue implements QueueInterface {


    static Stack<QueueNode> s1 = new Stack<QueueNode>();
    static Stack<QueueNode> s2 = new Stack<QueueNode>();

    @Override
    public void enqueue(QueueNode queue) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());

        }


        s1.push(queue);


        while (!s2.isEmpty()) {
            s1.push(s2.pop());

        }

    }


    @Override
    public String dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }


        QueueNode x = s1.peek();
        s1.pop();
        return x;

    }
}
