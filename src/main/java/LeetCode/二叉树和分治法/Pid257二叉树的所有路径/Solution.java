/**
 * created by popma
 * created time: 2020/1/1, 18:11
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * https://leetcode-cn.com/problems/binary-tree-paths/
 */

package LeetCode.二叉树和分治法.Pid257二叉树的所有路径;

import LeetCode.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 返回所有路径=搜索
// 分治
public class Solution {
    // 1.递归的定义:求出所有root到叶子的路径
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        // 3.递归的出口
        if (root == null) return paths;

        // 2.递归的拆解
        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rigthPaths = binaryTreePaths(root.right);

        for (String path : leftPaths) {
            paths.add(root.val + "->" + path);
        }
        for (String path : rigthPaths) {
            paths.add(root.val + "->" + path);
        }

        // 当只要一个root(叶子节点)的时候（二叉树的问题需要检查这个）
        if (paths.size() == 0) {
            paths.add("" + root.val);
        }
        return paths;
    }
}
