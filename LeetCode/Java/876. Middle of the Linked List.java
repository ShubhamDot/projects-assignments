class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while(l2 != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next.next;
        }

        return l1;
    }
}
