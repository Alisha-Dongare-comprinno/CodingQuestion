import java.util.*;

class Solution {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for(int i = 1; i <= k; i++) {
            int x = q.poll();
            st.push(x);
        }

        while(!st.isEmpty()) {
            int x = st.pop();
            q.add(x);
        }

        int rem = n - k;
        for(int i = 1; i <= rem; i++) {
            int x = q.poll();
            q.add(x);
        }

        return q;
    }
}


public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;

        Solution sol = new Solution();
        Queue<Integer> modifiedQueue = sol.modifyQueue(q, k);

        while (!modifiedQueue.isEmpty()) {
            System.out.print(modifiedQueue.poll() + " ");
        }
    }
}