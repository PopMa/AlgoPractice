package LeetCode.NineChapter.BFS;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

import java.util.*;

/**
 * created by popma
 * created time: 2020/4/20, 15:39
 */
public class Pid102二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                temp.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
}
