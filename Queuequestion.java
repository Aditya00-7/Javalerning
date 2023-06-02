import java.util.*;
public class Queuequestion {
     static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 =new Stack<>();
        public static  boolean isempty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isempty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }
        public static int Peek(){
            if(isempty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();
        }
     }
    public static void main(String args[]) {
            //QueueY.Queue q = new QueueY.Queue(5);
            // Queue<Integer>q =new LinkedList<>();
            //Queue<Integer>q;
          //  q = new ArrayDeque<>();
        Queue q =new Queue();

            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            while (!q.isempty()) {
                System.out.println(q.Peek());
                q.remove();
            }
        }
}