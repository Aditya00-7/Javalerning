import java.util.Scanner;

public class searchingarray {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int numbers[]=new int[size+1];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();

            
        } 
        int x = sc.nextInt();
        
        //output
         for(int i=0;i<numbers.length; i++){
                if(numbers[i]== x){
                System.out.println("x found at index:"+ i);

        }
    }
}
}
