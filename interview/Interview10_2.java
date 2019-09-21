package interview;
/**
 * Interview10_2
 */
public class Interview10_2 {

    public static void main(String[] args) {

    }

    public class Solution {
        public int JumpFloor(int target) {
            int a = 1;
            int b = 2;
            int c = 0;
            if (target == 1) {
                c = a;
            } else if (target == 2) {
                c = b;
            } else {
                for (int i = 0; i < target-2; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                }
            }
            return c;
        }
    }
}