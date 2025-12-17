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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        int max = 0;
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            if(max <= cur.val){
                max = cur.val;
                prev = cur;
            }else{
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        return reverse(head);
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}