package LeetCode.二叉树和分治法.平均值最大的子树;

import LeetCode.二叉树和分治法.TreeNode;

/**
 * created by popma
 * created time: 2020/1/7, 21:03
 */
class ResultType{
    public int sum;
    public int size;

    public ResultType(int sum, int size) {
        this.sum = sum;
        this.size = size;
    }
}

public class Solution {
    private TreeNode maxNode = null;
    private float maxAverage = -1*Float.MAX_VALUE;
    public TreeNode findSubtree2(TreeNode root) {
        // write your code here
        helper(root);
        return maxNode;
    }

    private ResultType helper(TreeNode root){
        if (root==null){
            return new ResultType(0,0);
        }

        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        ResultType rootResult = new ResultType(
                left.sum+right.sum+root.val,
                left.size+right.size+1
        );
//        int sum = root.val, size = 1;
//        if (left.size!=0) {
//            sum+=left.sum;
//            size+=left.size;
//        }
//        if (right.size!=0) {
//            sum+=right.sum;
//            size+=right.size;
//        }
        float average = (float)rootResult.sum/rootResult.size;
        if (average > maxAverage){
            maxNode = root;
            maxAverage = average;
        }
        return rootResult;
    }
}
