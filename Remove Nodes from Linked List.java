class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        head = reverse(head);// Reverse the linked list
        ListNode current = head;
        ListNode maxNode = head;
        while (current != null && current.next != null) {
            if (current.next.val < maxNode.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
                maxNode = current;
            }
        }
        // Reverse the linked list again to get the correct order
        return reverse(head);
    }
    private ListNode reverse(ListNode head) { // Helper function to reverse a linked list
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
// Alternate Way
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head==null) return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }
}