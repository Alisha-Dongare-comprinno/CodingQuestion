import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val) {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(val);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return stack1.peek();
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return stack1.pop();
    }

    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        System.out.println(queue.peek());
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
