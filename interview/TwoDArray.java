import java.util.Scanner;

/**
 * TwoDArray 题目:在一个二维数组中,每一行都按照从左到右递增的顺序排序, 
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数,输入这样的一
 * 个二维数组和一个整数,判断数组中是否含有该整数。
 */
public class TwoDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int a[][] = new int[n][n];
        int row = 0;
        int col=n-1;
        while (scanner.hasNext()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < 2*n; i++) {
                if (row>n-1||col<0) {
                    System.out.println("false");                    
                    break;
                }
                if (h>a[row][col]) {
                    row++;
                }else if (h<a[row][col]) {
                    col--;
                }else{
                    System.out.println("true");
                    break;
                }
            }
        }
    }
}