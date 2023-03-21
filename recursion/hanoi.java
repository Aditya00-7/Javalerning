package recursion;

public class hanoi {
    public static void main( String args[]){
        int n=2;
        towerhanoi(n,"s","H","D");
    }
    public static void towerhanoi( int n, String src, String helper, String dest ){
        if (n==1){
            System.out.println("transfer disk"+ n +" from "+src+" to "+dest);
            return;
        }
        towerhanoi(n-1,src,helper,dest);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerhanoi(n-1,helper,src,dest);
    }
}
