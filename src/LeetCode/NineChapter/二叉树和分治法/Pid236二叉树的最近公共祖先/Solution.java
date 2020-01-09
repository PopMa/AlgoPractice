package LeetCode.NineChapter.二叉树和分治法.Pid236二叉树的最近公共祖先;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/8, 00:11
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
// lowest common ancestor - LCA
// 分治法[中等难度]
public class Solution {
    // if A and B both in root, return lca(A,B)
    // if only A in root, return A
    // if only B in root, return B
    // if none in root, return null
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // exit
        if (root == null || p == root || q == root) { // only A or B in root
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) { // A B 分别在两侧，则root是祖先
            return root;
        }
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }
        return null; // none in root
    }
}
