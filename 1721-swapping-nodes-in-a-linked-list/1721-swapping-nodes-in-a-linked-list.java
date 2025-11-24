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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fn = head;
        ListNode eKth = head;
        for(int i = 1; i < k; i++){
            fn = fn.next;
        }
        ListNode sKth = fn;
        while(fn.next != null){
            fn = fn.next;
            eKth = eKth.next;
        }
        int temp = sKth.val;
        sKth.val = eKth.val;
        eKth.val = temp;
     return head;         
    }
}