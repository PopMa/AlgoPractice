package 剑指Offer;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/4/23, 13:38
 * BST的中序遍历就是递增序列
 */
public class Pid54二叉搜索树的第k大节点 {
    int res,k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;

    }

    private void dfs(TreeNode root) {
        if (root == null){
            return;
        }
        dfs(root.right);
//        if (k==0) return;
        k--;
        if (k == 0) {
            res = root.val;
        }
        dfs(root.left);
    }
}
