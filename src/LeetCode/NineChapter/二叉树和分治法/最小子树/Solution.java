package LeetCode.NineChapter.二叉树和分治法.最小子树;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/6, 14:25
 */
public class Solution {
    /**
     * @param root: the root of binary tree
     * @return: the root of the minimum subtree
     */
    private TreeNode subtree = null;
    private int minSum = Integer.MAX_VALUE;

    public TreeNode findSubtree(TreeNode root) {
        calSum(root);
        return subtree;
    }

    private int calSum(TreeNode root) {
        // 递归的出口
        if (root == null) return 0;
        int sum1 = calSum(root.left);
        int sum2 = calSum(root.right);

        // 分治
        int tempSum = sum1 + sum2 + root.val;
        // 打擂台（遍历）
        if (tempSum < minSum) {
            minSum = tempSum;
            subtree = root;
        }
        return tempSum;
    }
}
