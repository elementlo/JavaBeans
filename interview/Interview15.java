package interview;
/**
 * Interview15 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Interview15 {

    public static void main(String[] args) {

    }

    public class Solution {
        public int NumberOf1(int n) {
            String b = Integer.toBinaryString(n);
            int count = b.length() - b.replaceAll("1", "").length();
            return count;
        }
    }
}