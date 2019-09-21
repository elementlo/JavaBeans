package interview;
import java.util.Scanner;

/**
 * TwoDArray 题目:在一个二维数组中,每一行都按照从左到右递增的顺序排序, 每一列都按照从上到下递增的顺序排序。请完成一个函数,输入这样的一
 * 个二维数组和一个整数,判断数组中是否含有该整数。
 */
public class TwoDArray {

    public static void main(String[] args) {
        int[][] a= {{}};
        Find(0,a);
    }

    public static boolean Find(int target, int[][] array) {
        if (array == null || array.length<=0||array[0].length<=0) {
            return false;
        }
        int n = array.length;
        int row = 0;
        int col = n - 1;
        for (int i = 0; i < 2 * n; i++) {
            if (row > n - 1 || col < 0) {
                return false;
            }
            if (target > array[row][col]) {
                row++;
            } else if (target < array[row][col]) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }
}