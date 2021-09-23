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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        
        int temp = head.val;
        ListNode pointer = head;
        ListNode ls = head.next;
        
        while(ls != null){
            if(ls.val == temp){
                ls = ls.next;
                pointer.next = null;
            } else{
                pointer.next = new ListNode(ls.val);
                pointer = pointer.next;
                temp = ls.val;
                ls = ls.next;
            }
        }
        
        return head;
    }
}
