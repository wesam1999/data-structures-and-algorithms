package stack.and.queue.queue.data;

public class QueueNode {
    private String name;
    private String number;
    public QueueNode next;

    public QueueNode(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
