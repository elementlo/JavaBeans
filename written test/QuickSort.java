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
        if (start<end) { //考虑什么时候递归停下来
            int top = array[start];
            int s = start;
            int e = end;
            while (s < e) { //把选取的值保存为top后, 数组这个位置就可以借用出来.
                while (s < e && array[e] > top) {
                    e--;
                }
                if (s < e) {
                    array[s++] = array[e];//把后边的值给下标为s的元素之后, 这个位置也可以借用出来.
                }
                while (s < e && array[s] < top) {
                    s++;
                }
                if (s < e) {
                    array[e--] = array[s];// 把后边的值给下标为e的元素之后, 这个位置也可以借用出来.
                }
            }
            array[s] = top;//因为最后是把s处的值赋给e, 所以s处正好就是top的位置.
            quickSort(array, start, s - 1);
            quickSort(array, s + 1, end);
        }
    }
}