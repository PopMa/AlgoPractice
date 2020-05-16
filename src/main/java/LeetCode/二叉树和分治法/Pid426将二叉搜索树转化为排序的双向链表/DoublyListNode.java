package LeetCode.二叉树和分治法.Pid426将二叉搜索树转化为排序的双向链表;

/**
 * created by popma
 * created time: 2020/1/9, 10:11
 */
public class DoublyListNode {
    int val;
    DoublyListNode next,prev;

    public DoublyListNode(int val) {
        this.val = val;
        this.next = this.prev = null;
    }
}
