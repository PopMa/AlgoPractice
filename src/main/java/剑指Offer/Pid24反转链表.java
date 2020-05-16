package 剑指Offer;

import LeetCode.链表.ListNode;

/**
 * created by popma
 * created time: 2020/4/20, 17:30
 */
public class Pid24反转链表 {
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null){
//            return head;
//        }
//        ListNode newP = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newP;
//    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr!= null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
