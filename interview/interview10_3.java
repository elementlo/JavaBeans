package interview;
/**
 * interview10_3 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class interview10_3 {

    public static void main(String[] args) {

    }

    public class Solution {
        public int JumpFloorII(int target) {
            return 1 << (target - 1);// 1*2^(target-1)
        }
    }
}