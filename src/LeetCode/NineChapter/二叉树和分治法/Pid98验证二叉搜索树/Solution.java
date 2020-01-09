package LeetCode.NineChapter.二叉树和分治法.Pid98验证二叉搜索树;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/8, 20:28
 */
class ResultType {
    public boolean isBST;
    public TreeNode minNode, maxNode;

    public ResultType(boolean isBST) {
        this.isBST = isBST;
        this.minNode = null;
        this.maxNode = null;
    }


}

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root).isBST;
    }

    // 返回root是否为BST和minVal/maxVal
    private ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType(true);
        }
        ResultType rootResult = new ResultType(true);
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);

        if (left.isBST && right.isBST) {
            if ((left.maxNode != null && left.maxNode.val >= root.val) || (right.minNode != null && root.val >= right.minNode.val)) {
                rootResult.isBST = false;
            } else {
                rootResult.minNode = left.minNode != null ? left.minNode : root;
                rootResult.maxNode = right.maxNode != null ? right.maxNode : root;
            }
        } else {
            rootResult.isBST = false;
        }
        return rootResult;
    }
}
