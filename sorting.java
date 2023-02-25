public class sorting {
    public static void printArray(int arr[]) {
        for( int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        //bubble
        for( int i =0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1; j++){
                if (arr[j] >arr[j+1]){
                    //swap
                    int temp =arr[i];
                    arr[j]=arr[j+1];
                    arr[j+i]=temp;
                }
            }
        }
        printArray(arr);
    }
}