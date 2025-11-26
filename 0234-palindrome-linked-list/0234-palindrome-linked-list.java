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
    public boolean isPalindrome(ListNode head) {
        ListNode midNode = findMid(head);
        ListNode head2 = reverse(midNode);
        while(head!= null && head2 != null){
            if(head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
    public static ListNode findMid(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}