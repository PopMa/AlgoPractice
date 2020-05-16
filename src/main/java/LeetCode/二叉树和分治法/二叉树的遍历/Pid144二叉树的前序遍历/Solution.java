package LeetCode.二叉树和分治法.二叉树的遍历.Pid144二叉树的前序遍历;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2019/12/31, 23:11
 */

// 递归的方法

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        traverse(root, result);
        return result;
    }

    // 递归的三要素：
    // 1.递归的定义：把root为根的preorder加入到result里
    private void traverse(TreeNode root, ArrayList<Integer> result) {
        // 3.递归的出口
        if (root == null) {
            return;
        }
        // 2.递归的拆解
        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}