package interview;
/**
 * Interview17 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 保证base和exponent不同时为0
 */
public class Interview17 {

    public static void main(String[] args) {

    }

    public class Solution {
        public double Power(double base, int exponent) {
            double result = base;
            if (base == 0) {
                return 0;
            }
            if (exponent == 0) {
                result = 1;
            } else if (exponent > 0) {
                if (exponent!=1) {
                    for (int i = 1; i < exponent; i++) {
                        result *= base;
                    }
                }
            } else if (exponent < 0) {
                exponent = Math.abs(exponent);
                if (exponent==1) {
                    result=1/base;
                }else{
                    for (int i = 1; i < exponent; i++) {
                        result *= base;
                    }
                    result = 1 / result;
                }
            }
            return result;
        }
    }
}