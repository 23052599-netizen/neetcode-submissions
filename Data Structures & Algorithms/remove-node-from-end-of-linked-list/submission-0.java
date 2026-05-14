class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> seen  = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            seen.add(curr);
            curr = curr.next;

        }
        int remove = seen.size()-n;
        if(remove == 0){
            return head.next;
        }
        seen.get(remove - 1).next = seen.get(remove).next;
        return head;

    }
}
