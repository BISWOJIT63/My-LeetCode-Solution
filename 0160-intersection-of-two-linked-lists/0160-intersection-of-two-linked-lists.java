/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp = headA;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = headB;
        ListNode sp = headA;
        ListNode fp = headA;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp) break;
        }
        if(fp == null || fp.next == null){
            temp.next = null;
            return null;
        }
        sp = headA;
        while(sp != fp){
            sp = sp.next;
            fp = fp.next;
        }
        temp.next = null;
        return sp;
    }
}