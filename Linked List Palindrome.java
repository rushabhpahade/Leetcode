class Solution {
    public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) {
             return true; // Empty or single-node lists are palindromes.
         }
         // Find the middle of the linked list.
         ListNode slow = head;
         ListNode fast = head;
         while (fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }
         // Reverse the second half of the linked list.
         ListNode secondHalf = reverseLinkedList(slow);
         // Compare the first half and the reversed second half.
         ListNode firstHalf = head;
         while (secondHalf != null) {
             if (firstHalf.val != secondHalf.val) {
                 return false; // Values don't match, not a palindrome.
             }
             firstHalf = firstHalf.next;
             secondHalf = secondHalf.next;
         }
         return true; // Values match, it's a palindrome.
     }
     private ListNode reverseLinkedList(ListNode head) {
         ListNode prev = null;
         while (head != null) {
             ListNode nextNode = head.next;
             head.next = prev;
             prev = head;
             head = nextNode;
         }
         return prev;
     }
 
 }