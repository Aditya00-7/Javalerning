package recursion;

public class sorting {
    public static void main(String args[]) {
        int arr[]={1,3,5};
        System.out.println(sorting(arr,0));
    }
    public static boolean sorting(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }
            if (arr[idx] < arr[idx + 1]) {
                //array is sorted till now
               return sorting(arr, idx + 1);
            } else {
                return false;
            }
    }
}
