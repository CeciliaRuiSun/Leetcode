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
    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 38.3 MB, less than 64.74% 

    public ListNode deleteDuplicates(ListNode head) {
        ListNode ls = head;
        
        while(ls != null && ls.next != null){
            int temp = ls.val;

            while(ls.next != null && ls.next.val == temp){
                ls.next = ls.next.next;
            }
            
            ls = ls.next;
        }
        
        return head;
    }
}
