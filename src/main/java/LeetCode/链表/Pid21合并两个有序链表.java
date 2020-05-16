package LeetCode.链表;

/**
 * created by popma
 * created time: 2020/4/22, 15:00
 */
public class Pid21合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode head = new ListNode(0);
        ListNode res = head;
        while (h1!=null && h2!=null){
            if(h1.val < h2.val){
                res.next = h1;
                res = res.next;
                h1 = h1.next;
            }else {
                res.next = h2;
                res = res.next;
                h2 = h2.next;
            }
        }
        if (h1!=null){
            res.next = h1;
        }
        if (h2!=null){
            res.next = h2;
        }
        return head.next;
    }
}
