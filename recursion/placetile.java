package recursion;

public class placetile {
    public static void main(String args[]) {
        int n = 9, m = 6;
        System.out.println(placeTiles(n, m));
    }

    public static int placeTiles(int n, int m) {
        if (n < m) {
            return 1;
        } else if (n == m) {
            return 2;
        }
        return placeTiles(n - 1, m) + placeTiles(n - m, m);
    }
}
