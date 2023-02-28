package recursion;

public class powerfuction2 {
    public static void main(String[] args) {
        int x = 2, n= 5;
        int ans=calpower(x,n);
        System.out.println(ans);
    }

    public static int calpower(int x, int n) {
        if(n==0){
            return 1;
        }//basecase1
        if (x==0){
            return 0;
        }//basecase2
        //if n is even
        if ( n%2==0){
            return calpower(x,n/2)* calpower(x,n/2);
        }
        else{//n is odd
           return calpower(x,n/2)*calpower(x,n/2)*x;
        }
    }
}
