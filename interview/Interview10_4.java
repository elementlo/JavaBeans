/**
 * Interview10_4 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Interview10_4 {

    public static void main(String[] args) {

    }

    public class Solution {
        public int RectCover(int target) {
            int a = 1, b = 2, c = 0;
            for (int i = 1; i <= target; i++) {
                if (i == 1) {
                    c = a;
                } else if (i == 2) {
                    c = b;
                } else {
                    c = a + b;
                    a = b;
                    b = c;
                }
            }
            return c;
        }
    }
}