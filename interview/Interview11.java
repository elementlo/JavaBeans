/**
 * Interview11 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Interview11 {

    public static void main(String[] args) {

    }

    public static class Solution {
        public static int minNumberInRotateArray(int[] array) {
            if (array == null || array.length <= 0) {
                return 0;
            }
            int end = array.length - 1;
            int start = 0;
            if (array[0] < array[end]) {
                return array[0];
            }
            while (start < end) {
                if (start == end - 1) {
                    return array[end];
                }
                int m = (start + end) / 2;
                // {0,1,1,1,1}情况只能特殊考虑, 退化为顺序查找
                if (array[start]==array[end]&& array[end]==array[m]) {
                    return searchInOrder(array);
                }
                if (array[m] >= array[start]) {
                    start = m;
                } else if (array[m] <= array[end]) {
                    end = m;
                }
            }
            return 0;//为了编译通过, 可以不要
        }

        public static int searchInOrder(int array[]){
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i]<min) {
                    min=array[i];
                }
            }
            return min;
        }

    }
}