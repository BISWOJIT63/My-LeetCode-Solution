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
        ListNode tail = null;
        int c=0;
        while(temp != null){
            tail = temp;
            c++;
            temp = temp.next;
        }
        k = k%c;
        int l = c - k - 1;
        tail.next = head;
        temp = head;
        while(l != 0){
            temp = temp.next;
            l--;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}