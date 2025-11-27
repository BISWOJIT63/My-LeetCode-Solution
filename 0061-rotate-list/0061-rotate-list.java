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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int c=0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        if(c < k) k = k%c;
        System.out.println(k);
       return recursion(head,k);
    }
    public ListNode recursion(ListNode head, int k) {
        if(k == 0 ){
            return head;
        }
        ListNode tail = head.next;
        ListNode prev = head;
        while(tail.next != null){
            tail = tail.next;
            prev = prev.next;
        }
        tail.next = head;
        head = tail;
        prev.next = null;
        return recursion(head, k-1) ;
    }
}