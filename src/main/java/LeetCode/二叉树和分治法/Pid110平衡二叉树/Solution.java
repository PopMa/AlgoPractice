package LeetCode.二叉树和分治法.Pid110平衡二叉树;

import LeetCode.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/7, 17:49
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 */
class ResultType {
    public boolean isBalanced; // 是否为BST
    public int maxDepth; // BST的深度

    public ResultType(boolean isBalanced, int maxDepth) {
        this.isBalanced = isBalanced;
        this.maxDepth = maxDepth;
    }
}

public class Solution {
    //    private Boolean isBalanced = true;
//
//    public boolean isBalanced(TreeNode root) {
//        getHeight(root);
//        return isBalanced;
//    }
//
//    private int getHeight(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = getHeight(root.left);
//        int right = getHeight(root.right);
//        if (Math.abs(left-right) > 1){
//            isBalanced = false;
//        }
//        return 1+Math.max(left,right);
//    }
    private int NOT_BALANCED = -1;
    public boolean isBalanced(TreeNode root) {
        return helper(root).isBalanced;
    }

    // 判断BST：左右都是BST且自身为BST
    public ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType(true, 0);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        if (!left.isBalanced || !right.isBalanced) {
            return new ResultType(false, NOT_BALANCED);
        }
        if (Math.abs(left.maxDepth - right.maxDepth) > 1) {
            return new ResultType(false, NOT_BALANCED);
        }
        return new ResultType(true, Math.max(left.maxDepth, right.maxDepth) + 1);
    }
}
