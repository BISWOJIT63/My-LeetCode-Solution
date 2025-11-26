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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if( head == null || left == right) return head;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;
       for(int i = 1; i < left; i++){
            prev = prev.next;
       }

       ListNode start = prev.next;
       //reverse
       ListNode curr = start;
       ListNode prevNode = null;
       ListNode next = null ;
       int i = 0;

       while(i < right -left+1){
            next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
            i++;
       }
        start.next = curr;
        prev.next = prevNode;
    return dummyNode.next;
    }
}