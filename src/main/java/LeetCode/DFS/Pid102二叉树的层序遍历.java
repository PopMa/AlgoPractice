package LeetCode.DFS;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/4/20, 15:39
 */
public class Pid102二叉树的层序遍历 {
    List<List<Integer>> res = new ArrayList<>();

    // DFS
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
