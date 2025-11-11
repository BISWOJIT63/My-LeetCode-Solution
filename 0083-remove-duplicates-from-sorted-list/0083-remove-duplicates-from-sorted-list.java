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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode curr= head;
        ListNode newNode = new ListNode(curr.val);
        ListNode temp =newNode;
        curr = curr.next;
        while(curr != null){
           if(curr.val != temp.val){
            temp.next = new ListNode(curr.val);
            temp = temp.next;
           }
           curr = curr.next;
        }
        return newNode;
    }
}