package 每日一题202005;

import LeetCode.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/5/10, 16:10
 */
public class Pid236_二叉树的最近公共祖先 {
    //如果 pp 和 qq 都存在，则返回它们的公共祖先；
    //如果只存在一个，则返回存在的一个；
    //如果 pp 和 qq 都不存在，则返回NULL
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left != null && right != null) {
            return root;
        }
        return null;
    }
}
