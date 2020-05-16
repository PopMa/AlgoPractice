package LeetCode.链表;

/**
 * created by popma
 * created time: 2020/4/30, 22:30
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class Pid234_回文链表 {
    //    ListNode left;
//    public boolean isPalindrome(ListNode head) {
//        left = head;
//        return traverse(head);
//    }
//
//    private boolean traverse(ListNode right) {
//        if (right == null) return true;
//        boolean res = traverse(right.next);
//
//        // 后序遍历
//        res = res && (right.val == left.val);
//        left = left.next;
//        return res;
//    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            // 奇数
            slow = slow.next;
        }
        boolean res = true;
        while (slow != null) {
            if (head.val != slow.val) {
                res = false;
                break;
            } else {
                head = head.next;
                slow = slow.next;
            }
        }
        return res;
    }
}
