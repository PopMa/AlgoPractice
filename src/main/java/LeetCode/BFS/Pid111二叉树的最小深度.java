package LeetCode.BFS;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by popma
 * created time: 2020/4/20, 14:41
 */
public class Pid111二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                // 下一层
                TreeNode curr = queue.poll();
                if (curr.left == null && curr.right == null) {
                    return depth;
                }
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            /* 这里增加步数 */
            depth++;
        }
        return depth;
    }

    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth2(root.left) + 1;
        int right = minDepth2(root.right) + 1;
        return Math.min(left, right);
    }
}
