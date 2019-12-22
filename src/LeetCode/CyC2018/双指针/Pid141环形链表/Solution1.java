package LeetCode.CyC2018.双指针.Pid141环形链表;

/**
 * created by popma
 * created time: 2019/12/22, 9:09 下午
 */

import java.util.List;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
// 快慢指针，如果有环，快慢指针会相等。
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution1 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null) return false; // no cycle
            slow = slow.next;
            fast = fast.next.next;
        }
        return true; // slow = fast
    }
}