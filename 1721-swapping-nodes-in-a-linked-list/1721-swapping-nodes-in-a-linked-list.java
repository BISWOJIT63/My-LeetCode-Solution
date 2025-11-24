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
        ListNode cur = head;
        int l = 1;
        while(cur != null){
            l++;
            cur = cur.next;
        }
        int i = 1;
        ListNode sKth = head;
        while(i < k){
            sKth = sKth.next;
            i++;
        }
        i = 1;
        ListNode eKth = head; 
        while(i < l-k){
            eKth = eKth.next;
            i++;
        }
        int temp = sKth.val;
        sKth.val = eKth.val;
        eKth.val = temp;
        System.out.println(sKth.val);
        System.out.println(eKth.val);

    return head;         
    }
}