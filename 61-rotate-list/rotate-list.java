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
    public static int lengthOflinkedlist(ListNode temp)
    {
        int count = 0 ;
        while(temp != null)
        {
            temp = temp.next ;
            count++ ;
        }
        return count ;
    }
    public ListNode rotateRight(ListNode head, int k) {
      
        if(head == null || head.next == null || k == 0) return head;
        ListNode temp = head;

        int n = lengthOflinkedlist(temp);       
        k = k % n;
        if(k == 0) return head;
        int rem = n - k;
        // int count = 1;

        temp = head;

        while(rem > 1 && temp != null)
        {
            temp = temp.next;
            rem--;
        }

        ListNode newhead = temp.next;
        temp.next = null;

        ListNode temp2 = newhead;

        while(temp2.next != null )
        {
            temp2 = temp2.next;
        }
         temp2.next = head;
         return newhead;
    }
    //  return newhead;
}


      