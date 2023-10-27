import java.util.*;
import java.io.*;

// rajeev
class Reversing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Queue<Integer> q = new LinkedList<>();
            String s = br.readLine();
            String[] a = s.split(" ");
            for (String b : a) {
                int x = Integer.parseInt(b);
                q.add(x);
            }
            Demo g = new Demo();
            q = g.rev(q);
            while (!q.isEmpty()) {
                int x = q.peek();
                q.poll();
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

class Demo {
    public Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty())
            st.push(q.remove());

        while (!st.isEmpty())
            q.add(st.pop());

        return q;
    }
}
