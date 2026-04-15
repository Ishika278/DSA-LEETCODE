/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

import java.util.*;

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        Stack<Node> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            if (temp.child != null) {
                if (temp.next != null) {
                    stack.push(temp.next);
                }

                temp.next = temp.child;
                temp.child.prev = temp;
                temp.child = null;
            }
            else if (temp.next == null && !stack.isEmpty()) {
                temp.next = stack.pop();
                temp.next.prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}