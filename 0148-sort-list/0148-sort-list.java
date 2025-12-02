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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);  
    }
    public static ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode sp = head;
        ListNode fp = head.next;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next; 
        }
        ListNode mid = sp.next;
        sp.next = null;
        ListNode h1 = mergeSort(head);
        ListNode h2 = mergeSort(mid);
        return merge(h1,h2);
    }
    public static ListNode merge(ListNode h1,ListNode h2){
        ListNode head = new  ListNode(-1);
        ListNode tail = head;
        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                tail.next = h1;
                tail = tail.next;
                h1 = h1.next;
            }else{
                tail.next = h2;
                tail = tail.next;
                h2 = h2.next;
            }
        }
        if(h1 == null){
            tail.next = h2;
        }else{
            tail.next = h1;
        }
        return head.next;
    }
}