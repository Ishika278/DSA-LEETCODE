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
        ListNode prev = null;
        ListNode curr = head;
      // ListNode Next = head.next;
      while(curr != null)
      {
        //if(root == null || root.next == null) return;
        ListNode Next = head.next;
        Next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = Next;
       
      }  
      return prev;
    }
}