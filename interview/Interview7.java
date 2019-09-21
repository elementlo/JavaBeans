package interview;
import java.util.Arrays;

/**
 * Interview7 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。 前序:父左右,
 * 中序:左父右.
 */
public class Interview7 {

    public static void main(String[] args) {
        int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
        int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
        Solution.reConstructBinaryTree(pre, in);
    }

    public static class Solution {
        public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
            int rootNode = pre[0];
            TreeNode treeNode = new TreeNode(rootNode);
            int n = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] == rootNode) {
                    n = i;
                    break;
                }
            }
            int[] lPreOrder = new int[n];
            int[] lInOrder = new int[n];
            int[] rPreOrder = new int[in.length - (n + 1)];
            int[] rInOrder = new int[in.length - (n + 1)];
            int i=0;
            if (lPreOrder.length != 0) {
                for (i = 0; i < in.length; i++) {
                    if (in[i] == rootNode) {
                        break;
                    }
                    lInOrder[i] = in[i];
                    lPreOrder[i] = pre[i + 1];
                }
                treeNode.left = reConstructBinaryTree(lPreOrder, lInOrder);
            } else {
                treeNode.left = null;
            }
            if (rPreOrder.length != 0) {
                for (int j = i + 1; j < in.length; j++) {
                    rInOrder[j - (i + 1)] = in[j];
                    rPreOrder[j - (i + 1)] = pre[j];
                }
                treeNode.right = reConstructBinaryTree(rPreOrder, rInOrder);
            } else {
                treeNode.right = null;
            }

            // System.out.println(Arrays.toString(lInOrder) + "\n" + Arrays.toString(lPreOrder) + "\n"
            //         + Arrays.toString(rInOrder) + "\n" + Arrays.toString(rPreOrder));

            return treeNode;
        }

    }

    // Definition for binary tree
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
//这题有点难度, 现在这个算法还能优化不少, 只是初版.:)