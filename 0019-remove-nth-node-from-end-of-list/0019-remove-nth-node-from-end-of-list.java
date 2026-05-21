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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }
        int remove_idx = length - n;
        if(remove_idx==0){
            return head.next;
        }
        temp = head;
        for(int i=1;i<remove_idx;i++)
        {
            temp = temp.next;
        } 
        temp.next = temp.next.next;
        return head;
        
    }
}