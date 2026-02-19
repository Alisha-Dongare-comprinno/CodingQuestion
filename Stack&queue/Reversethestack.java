import java.util.Stack;

public class Main {   
    static void reverse(Stack<Integer> s) {
        if (s.isEmpty())
            return;

        int top = s.pop();
        reverse(s);
        insert(s, top);
    }

    static void insert(Stack<Integer> s, int top) {
        if (s.isEmpty()) {
            s.push(top);
            return;
        }

        int elm = s.pop();
        insert(s, top);
        s.push(elm);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: " + s);

        reverse(s);

        System.out.println("Reversed Stack: " + s);
    }
}
