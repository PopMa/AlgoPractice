package LeetCode.NineChapter.二叉树和分治法.Pid104二叉树的最大深度;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/1, 18:01
 */

// 递归法/遍历
public class Solution2 {
    private int depth;

    public int maxDepth(TreeNode root){
        depth = 0;
        helper(root,1);
        return depth;
    }

    private void helper(TreeNode node, int curDepth){
        if (node==null){
            return;
        }
        depth = Math.max(depth,curDepth);

        helper(node.left,curDepth+1);
        helper(node.right,curDepth+1);
    }
}
