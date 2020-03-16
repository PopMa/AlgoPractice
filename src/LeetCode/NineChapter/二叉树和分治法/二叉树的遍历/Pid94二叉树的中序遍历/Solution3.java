package LeetCode.NineChapter.二叉树和分治法.二叉树的遍历.Pid94二叉树的中序遍历;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * created by popma
 * created time: 2020/1/9, 14:08
 * 题解：首先访问左子树，将左子树存入栈中，
 * 每次将栈顶元素存入结果，如果右子树为空，取出栈顶元素，
 * 如果当前元素为栈顶元素右子树，一直弹出至当前元素不为栈顶元素右子树
 * (此处说明访问右子树，根节点已经被访问过，弹出即可)。
 * 如果节点右子树不为空，访问右子树，继续循环遍历左子树，存入栈中。
 * https://www.jiuzhang.com/solutions/binary-tree-inorder-traversal/
 */

// 非递归
public class Solution3 {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            result.add(node.val);

            if (node.right == null) {
                node = stack.pop();
                while (!stack.isEmpty() && stack.peek().right == node) {
                    node = stack.pop();
                }
            } else {
                node = node.right;
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        return result;
    }
}
