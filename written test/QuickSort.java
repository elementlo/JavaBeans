import java.util.Arrays;

/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array={4,56,6,23,23,456,1,34,567};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start<end) {
            int top = array[start];
            int s = start;
            int e = end;
            while (s < e) {
                while (s < e && array[e] > top) {
                    e--;
                }
                if (s < e) {
                    array[s++] = array[e];
                }
                while (s < e && array[s] < top) {
                    s++;
                }
                if (s < e) {
                    array[e--] = array[s];
                }
            }
            array[s] = top;
            quickSort(array, start, s - 1);
            quickSort(array, s + 1, end);
        }
    }
}