package LeetCode.NineChapter.二叉树和分治法.二叉树的遍历.Pid144二叉树的前序遍历;

import LeetCode.NineChapter.二叉树和分治法.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * created by popma
 * created time: 2020/1/1, 15:00
 */

// Version 0: Non-Recursion (Recommend)
// 面试中如果考察二叉树遍历，可能是问非递归的方法
public class Solution3 {
    public List<Integer> preorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preorder = new ArrayList<Integer>();

        if (root == null){
            return preorder;
        }else {
            stack.push(root);
        }

        while (!stack.empty()){
            TreeNode node = stack.pop();
            preorder.add(node.val);
            if (node.right!=null){
                stack.push(node.right); // 先进去后出，先序遍历先把右子节点加入
            }
            if (node.left !=null){
                stack.push(node.left);
            }
        }

        return preorder;
    }
}
