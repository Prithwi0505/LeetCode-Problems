/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int n1 = 0;
        ListNode cur = head;
        while(cur != null){
            n1++;
            cur = cur.next;
        }
        int del = n1 - n;
        if(del == 0) return head.next;
        n1 = 0;
        cur = head;
        while(cur != null){
            n1++;
            if(n1 == del){
                ListNode temp = cur.next;
                cur.next = cur.next.next;
                temp.next = null;
            }
            cur = cur.next;
        }
        return head;
    }
}