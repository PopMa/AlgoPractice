package 每日一题202005;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/5/13, 10:12
 */
public class Pid102_二叉树的层次遍历 {
    List<List<Integer>> res = new ArrayList<>();

    // BFS 广度优选搜索
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> tempRes = new ArrayList<>();
            int size = queue.size();// 这一层的个数
            // 遍历这一层
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll(); // 取出队列最前面的
                tempRes.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);

                }
            }
            res.add(new ArrayList<>(tempRes));
        }
        return res;
    }

    // 方法2: DFS 深度优先搜索
    public List<List<Integer>> levelOrder2(TreeNode root) {
        dfs(root, 0); // 顶点为第0层
        return res;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (res.size() < level + 1) {  // 还没进到这一层
            res.add(new ArrayList<>());
        }
        List<Integer> levelList = res.get(level);
        levelList.add(root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }

}



