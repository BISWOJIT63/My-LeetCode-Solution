class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head.next;
        ListNode lastSorted = head;
        while(cur != null ){
            if (lastSorted.val <= cur.val) {
                lastSorted = cur;
            } else {
                ListNode prev = dummy;
                while (prev.next.val <= cur.val) {
                    prev = prev.next;
                }

                lastSorted.next = cur.next; // Detach cur from its old position
                cur.next = prev.next;       // Link cur to the rest of the list
                prev.next = cur;            // Link prev to cur
            }
            cur = lastSorted.next; // Move to the next unsorted node
        }
        return dummy.next;
    }
}