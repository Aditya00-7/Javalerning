package recursion;

public class recursion1 {
        public static void main(String[] args)  {
            int n = 5;
            printnumber(n);
        }
        public static void printnumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnumber(n - 1);}



 }

