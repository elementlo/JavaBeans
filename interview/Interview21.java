package interview;

import java.util.Arrays;

/**
 * Interview21 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Interview21 {
    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 1, 3, 5, 7 };
        Solution2.reOrderArray(a);
        System.out.println(Arrays.toString(a));
    }

    // 因为要保证相对位置不变, 所以此方法不行
    public class Solution {
        public void reOrderArray(int[] array) {
            if (array == null || array.length <= 0) {
                return;
            }
            int s = 0;
            int e = array.length - 1;
            int temp;
            while (s < e) {
                while (s < e && array[s] % 2 != 0) {
                    s++;
                }
                while (s < e && array[e] % 2 == 0) {
                    e--;
                }
                if (s < e) {
                    temp = array[s];
                    array[s] = array[e];
                    array[e] = temp;
                }
            }
        }
    }

    public static class Solution2 {
        public static void reOrderArray(int[] array) {
            if (array == null || array.length <= 0) {
                return;
            }
            int l = array.length;
            int temp = 0;
            int index = 0;
            for (int i = 0; i < l; i++) {
                if (array[index] % 2 == 0) {
                    temp = array[index];
                    for (int j = index + 1; j < l; j++) {
                        array[j - 1] = array[j];
                    }
                    array[l - 1] = temp;
                } else if (array[index] % 2 != 0) {
                    index++;
                }
            }
        }
    }
}