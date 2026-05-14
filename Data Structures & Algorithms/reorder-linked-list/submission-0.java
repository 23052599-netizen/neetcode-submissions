class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode preMiddle = slow;
        ListNode preCurrent = slow.next;

        while (preCurrent.next != null) {

            ListNode current = preCurrent.next;

            preCurrent.next = current.next;

            current.next = preMiddle.next;

            preMiddle.next = current;
        }

        // Step 3: Reorder
        ListNode p1 = head;
        ListNode p2 = preMiddle.next;

        while (p1 != preMiddle) {

            preMiddle.next = p2.next;

            p2.next = p1.next;

            p1.next = p2;

            p1 = p2.next;

            p2 = preMiddle.next;
        }
    }
}