package 剑指Offer;

import LeetCode.NineChapter.链表.ListNode;

/**
 * created by popma
 * created time: 2020/4/20, 16:54
 */
public class Pid22链表中倒数第k个节点 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node = head;
        while (k>0){
            node = node.next;
            k--;
        }
        while (node != null){
            head = head.next;
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode m = getKthFromEnd(null,2);
    }
}
