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
        ListNode p1= head;
        while(p1 != null && p1.next != null){
            ListNode p2 = p1.next;
            if(p1.next != null && p1.val == p2.val){
                p1.next = p2.next;
            }else{
              p1 = p1.next;
            }
        }
        return head;
    }
}