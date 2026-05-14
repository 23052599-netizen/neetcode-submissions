class Solution {
    public void reorderList(ListNode head) {

        if (head == null ) {
            return;
        }

         List<ListNode> node = new ArrayList<>();

         ListNode curr = head;
         while(curr != null){
         node.add(curr);
         curr = curr.next;
         }
         int i  = 0 ; 
         int j = node.size()-1;
         while(i < j){
            node.get(i).next = node.get(j);
            i++;
            if(i>j){
                break;
            }
            node.get(j).next = node.get(i);
            j--;
         }
         node.get(i).next = null;

    }
}