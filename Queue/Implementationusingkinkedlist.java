import java.util.EmptyStackException;

public class stack {
    private Node top;
    private int size;
    
    private class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }
     
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public int size() {
        return size;
    }
     
    public boolean isEmpty() {
        return size == 0;
    }

    public void displayStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack st = new stack();

        System.out.println("Is Stack Empty: " + st.isEmpty());

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack elements:");
        st.displayStack();

        System.out.println("Top element: " + st.peek());

        System.out.println("Popped element: " + st.pop());

        System.out.println("After pop:");
        st.displayStack();

        System.out.println("Stack size: " + st.size());
    }
}
