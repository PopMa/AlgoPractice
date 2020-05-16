package 剑指Offer;

import LeetCode.链表.ListNode;

/**
 * created by popma
 * created time: 2020/4/20, 16:34
 */
public class Pid18删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode curr = head;
        if (head.val == val) {
            return head.next;
        }
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
            if(curr == null){
                break;
            }
        }
        return head;
    }
}
