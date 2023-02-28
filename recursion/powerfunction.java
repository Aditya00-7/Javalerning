package recursion;


public class powerfunction {
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
        int xpownm1=calpower(x,n-1);
        int xpown=x*xpownm1;
        return xpown;
    }

}
