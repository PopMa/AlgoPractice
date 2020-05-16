package LeetCode.二叉树和分治法.Pid114二叉树展开为链表;

import LeetCode.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/9, 11:08
 * 给定一个二叉树，原地将它展开为链表。
 * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 */
// 二叉树结构变化问题
public class Solution {
    private TreeNode lastNode= null;
    // 没看懂
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }

        if (lastNode!=null){
            lastNode.left = null;
            lastNode.right = root;
        }

        lastNode = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
    }

}
