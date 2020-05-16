package LeetCode.二叉树和分治法.二叉树的遍历.Pid94二叉树的中序遍历;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/1/9, 11:57
 */
// 分治
public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null){
            return result;
        }
        List<Integer> left = inorderTraversal(root.left);
        List<Integer> right = inorderTraversal(root.right);
        result.addAll(left);
        result.add(root.val);
        result.addAll(right);
        return result;
    }
}
