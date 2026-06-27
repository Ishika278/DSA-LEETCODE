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
     public static ListNode reverse(ListNode head)
     {
        //convert any linkedlist to list/vector
        //operation
        //convert to linkedlist
        
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
     }
        public void reorderList(ListNode head)
        {
          if(head == null || head.next == null) return;

          //middle of list
          ListNode slow = head;
          ListNode fast = head;

          while(fast != null && fast.next != null)
          {
            slow = slow.next;
            fast = fast.next.next;
          }
        
         //reverse second half
        ListNode curr2 = reverse(slow.next);
        slow.next = null;

        //Merge
        ListNode curr1 = head;

        while(curr2 != null)
        {
            ListNode Next1 = curr1.next;
            ListNode Next2 = curr2.next;

            curr1.next = curr2;//list 1 to list 2 connection
            curr2.next = Next1;//list 2 to list 1

            curr1 = Next1;
            curr2 = Next2;
        }
    }
}