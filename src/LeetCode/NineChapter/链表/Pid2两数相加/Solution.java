package LeetCode.NineChapter.链表.Pid2两数相加;

/**
 * created by popma
 * created time: 2020/3/14, 22:09
 */

import LeetCode.NineChapter.链表.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = (x + y + carry);
            ListNode newP = new ListNode( sum% 10);
            carry = sum >= 10 ? 1 : 0;
            curr.next = newP;
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) {
            curr.next = new ListNode(carry);
        }
        return res.next;
    }
}