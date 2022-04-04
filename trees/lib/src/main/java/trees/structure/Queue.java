package trees.structure;



import trees.data.BTNode;

import static java.lang.System.exit;
import static sun.nio.cs.Surrogate.MAX;

public class Queue<T> {
    BTNode[] queue = new BTNode[0];
    int front = -1;
            int rear = -1;
    public void enqueue(BTNode vertex) {

        if(rear == MAX-1)
            System.out.println("Queue Overflow\n");
        else
        {
            if(front == -1)
                front = 0;
            rear = rear+1;
            queue[rear] = (BTNode) vertex;
        }
    }



    public boolean isQueueEmpty() {
        if(front == -1 || front > rear)
            return true;
        else
            return false;
    }

    public BTNode dequeue() {
        BTNode delete_item;
        if(front == -1 || front > rear)
        {
            System.out.println("Queue Underflow\n");
            exit(1);
        }


        delete_item = queue[front];
        front = front+1;
        return delete_item;
    }
}
