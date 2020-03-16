package LeetCode.NineChapter.二叉树和分治法.Pid114二叉树展开为链表;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/9, 11:24
 */
public class Solution2 {
    public void flatten(TreeNode root) {
        helper(root);
    }

    // 返回最后一个node，为了拼接
    public TreeNode helper(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftLast = helper(root.left);
        TreeNode rightLast = helper(root.right);

        if (leftLast != null) {
            leftLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        if (rightLast != null) {
            return rightLast;
        }

        if (leftLast != null) {
            return leftLast;
        }

        return root;
    }

}
