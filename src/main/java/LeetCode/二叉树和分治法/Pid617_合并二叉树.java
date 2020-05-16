package LeetCode.二叉树和分治法;

/**
 * created by popma
 * created time: 2020/5/2, 20:53
 */
public class Pid617_合并二叉树 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t2.right, t2.right);
        return t1;
    }
}
