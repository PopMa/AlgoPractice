package LeetCode.NineChapter.二叉树和分治法.Pid104二叉树的最大深度;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/1, 17:53
 */
// 分治法
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }
}
