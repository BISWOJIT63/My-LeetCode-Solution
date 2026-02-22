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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }
        int n = 0;
        ListNode temp  = head;
        while(temp != null && n < k){
            temp = temp.next;
            n++;
        }
        if(n < k) return head;
        ListNode newHead = reverse(head,k);
        head.next = reverseKGroup(temp,k);
        return newHead;
    }
    public ListNode reverse(ListNode head, int k){
        ListNode prev = null;
        ListNode curr = head;
        while(k > 0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        return prev;
    }
}