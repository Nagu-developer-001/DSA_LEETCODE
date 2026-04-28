/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        Set<ListNode> s = new HashSet<>();
        while(curr1!=null)
        {
            s.add(curr1);
            curr1 = curr1.next;
        }
        while(curr2!=null)
        {
            if(s.contains(curr2))
            {
                return curr2;
            }
            else{
                curr2 = curr2.next; 
            }
        }
        return null;
    }
}