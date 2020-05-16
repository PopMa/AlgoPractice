package 剑指Offer;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * created by popma
 * created time: 2020/4/5, 18:23
 */
public class Pid7重建二叉树 {
    private Map<Integer, Integer> indexForOrders = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexForOrders.put(inorder[i], i);
        }
        return reConstructBinaryTree(preorder, 0, preorder.length - 1, 0);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForOrders.get(root.val);
        int leftTreeSize = inIndex - inL;

        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }
}
