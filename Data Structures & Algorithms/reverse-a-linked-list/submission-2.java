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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stck  =  new Stack<>();

        while(head != null){
            stck.push(head.val);
            head = head.next;
        }
        ListNode reverse = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = reverse;

        while(!stck.isEmpty()){
            ptr.next  = new ListNode(stck.pop());
            ptr = ptr.next;
        }
        return reverse.next;
        
    }
}
