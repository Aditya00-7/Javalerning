import java.util.*;
public class framworkqueue {
        public static void main(String args[]) {
            //QueueY.Queue q = new QueueY.Queue(5);
           // Queue<Integer>q =new LinkedList<>();
            Queue<Integer>q;
            q = new ArrayDeque<>();

            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
}
