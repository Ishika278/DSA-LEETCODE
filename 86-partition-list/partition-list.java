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
            //method 1 
 //first add lesser element than x insert in list then add greater element in list 
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode dummy = new ListNode(0);// create dummy when we change head //like empty array
        ListNode list = dummy;
        //val less than x
        while(temp != null)
        {
            if(temp.val < x)
            { 
                ListNode newNode = new ListNode(temp.val);
                dummy.next = newNode;
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null)
        {
            if(temp.val >= x)
            {
                ListNode newNode = new ListNode(temp.val);
                dummy.next = newNode;
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        return list.next;
    }
}