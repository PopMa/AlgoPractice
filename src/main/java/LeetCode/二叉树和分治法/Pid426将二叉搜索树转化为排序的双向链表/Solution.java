package LeetCode.二叉树和分治法.Pid426将二叉搜索树转化为排序的双向链表;

import LeetCode.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/8, 21:50
 * convert a binary tree to doubly linked list with in-order traversal
 */
class ResultType{
    DoublyListNode first,last;

    public ResultType(DoublyListNode first, DoublyListNode last) {
        this.first = first;
        this.last = last;
    }
}

public class Solution {
    public DoublyListNode bstToDoublyList(TreeNode root){
        if (root == null){
            return null;
        }

        ResultType result = helper(root);
        return result.first;
    }
    // in-order traversal
    public ResultType helper(TreeNode root){
        if (root == null){
            return null;
        }

        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        DoublyListNode node = new DoublyListNode(root.val);
        ResultType result = new ResultType(null,null);

        if (left == null){
            result.first = node;
        }else {
            result.first = left.first;
            // connect list
            left.last.next = node;
            node.prev = left.last;
        }

        if (right == null){
            result.last = node;
        }else {
            result.last = right.last;
            right.first.prev = node;
            node.prev = right.first;
        }

        return result;
    }

}
