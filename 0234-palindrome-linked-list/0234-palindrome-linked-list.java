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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        Stack<Integer> st = new Stack<>();
        System.out.println(slow);
        while(slow!=null)
        {
            st.push(slow.val);
            slow = slow.next;
        }
        while(head!=null)
        {
            int data = st.pop();
            if(data != head.val)
            {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}