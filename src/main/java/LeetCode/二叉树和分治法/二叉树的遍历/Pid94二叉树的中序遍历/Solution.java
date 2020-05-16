package LeetCode.二叉树和分治法.二叉树的遍历.Pid94二叉树的中序遍历;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/1/9, 11:50
 */
// version1: 递归
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode root, ArrayList<Integer> result) {
        if (root == null){
            return;
        }
        traverse(root.left,result);
        result.add(root.val);
        traverse(root.right,result);
    }


}
