package 剑指Offer;

import LeetCode.链表.ListNode;

/**
 * created by popma
 * created time: 2020/4/28, 14:15
 */
public class Pid25合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1.val < l2.val ? l1 : l2;
        ListNode curr = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return head;
    }
}
