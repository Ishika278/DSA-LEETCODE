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
    public ListNode reverseKGroup(ListNode head, int k) {
        //base case
        if(head == null) return null;

       // ListNode temp1 = head;
        ListNode temp = head;
        int count = 1;
        while(count < k && temp != null)
        {
            temp = temp.next;
            count++;
        }

        if(temp == null) return head;
        ListNode newHead = temp.next;
        temp.next = null;
        ListNode reverseHead = reverseList(head);
        head.next = reverseKGroup(newHead, k);

        return reverseHead;
    }
    private ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}