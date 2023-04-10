package recursion;

public class callguests {
    public static void main(String args[]){
        int n=4;
        System.out.println(callguest(n));
    }
    public static int callguest(int n){
           if (n<=1){
               return 1;
           }
        //single
        int ways1=callguest(n-1);
          //pair
        int ways2=(n-1) * callguest(n-2);
        return ways1 + ways2;
    }
}
