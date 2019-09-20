/**
 * Interview15
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