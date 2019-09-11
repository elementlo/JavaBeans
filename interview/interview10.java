/**
 * interview10 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 */
public class interview10 {

    public static void main(String[] args) {

    }

    public class Solution {
        public int Fibonacci(int n) {
            int a = 0, b = 1, c;
            for (int i = 0; i <= n; i++) {
                if (i = 0) {
                    c = 0;
                } else if (i = 1) {
                    c = 1;
                } else {
                    c = a + b;
                    a=b;
                    b=c;
                }
            }
            return c;
        }
    }
}