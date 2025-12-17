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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        LinkedList<String> list = new LinkedList<>();
        while(head != null){
            while(!st.isEmpty() && head.val > st.peek().val){
                st.pop();
            }
            st.push(head);
            head = head.next;
        }
        if(st.isEmpty()) return null;
        head = st.pop();
        while(!st.isEmpty()){
            ListNode node = head;
            head = st.pop();
            head.next = node;
        }
        return head;
    }
}