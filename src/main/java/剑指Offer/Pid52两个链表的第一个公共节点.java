package 剑指Offer;

import LeetCode.链表.ListNode;

/**
 * created by popma
 * created time: 2020/4/20, 17:56
 */
public class Pid52两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        // 双指针 相遇
        while (pA!=pB){
            pA = pA==null? headB:pA.next;
            pB = pB==null? headA:pB.next;
        }
        return pA;
    }
}
