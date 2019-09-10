/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(binarySearch(1, a));

    }

    public static boolean binarySearch(int t, int[] a) {
        if (a == null || a.length <= 0) {
            return false;
        }
        int s = 0;
        int e = a.length - 1;
        int m;
        while (s <= e) {
            m = (s + e) / 2;
            if (t == a[m]) {
                return true;
            } else if (t > a[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return false;
    }
}