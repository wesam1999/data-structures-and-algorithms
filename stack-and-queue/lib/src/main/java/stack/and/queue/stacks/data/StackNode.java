package stack.and.queue.stacks.data;

public class StackNode {
    private String name;
    private String number;
            private StackNode next;

    public StackNode(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

}
