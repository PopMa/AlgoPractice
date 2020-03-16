package LeetCode.NineChapter.链表.Pid206反转链表;

import LeetCode.NineChapter.链表.ListNode;

import java.util.List;

/**
 * created by popma
 * created time: 2020/1/18, 14:23
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
//        ListNode prev = null; //前指针节点
//        ListNode curr = head; //当前指针节点
//        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
//        while (curr != null) {
//            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
//            curr.next = prev; //将当前节点指向它前面的节点
//            prev = curr; //前指针后移
//            curr = nextTemp; //当前指针后移
//        }
//        return prev; // curr = null
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            next.next = curr;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    // 递归
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newP = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newP;
    }

}
