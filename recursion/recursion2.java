package recursion;

public class recursion2 {

        public static void main(String[] args)  {
            int n = 1;
            printnumber(n);
        }
        public static void printnumber(int n) {
            if (n == 6) {
                return;
            }
            System.out.println(n);
            printnumber(n + 1);}



}

