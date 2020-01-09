package LeetCode.NineChapter.二叉树和分治法.二叉树的遍历.Pid144二叉树的前序遍历;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/1/1,   15:35
 */

// 分治法
public class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        // null or leaf
        if (root == null){
            return result;
        }
        // divide
        List<Integer> left = preorderTraversal(root.left);
        List<Integer> right = preorderTraversal(root.right);

        // conquer
        result.add(root.val);
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
