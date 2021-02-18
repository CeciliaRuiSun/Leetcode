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
    /**recursion:
     * 1 --> 2--> 3 --> 4 --> 5 --> null
     * null <-- 1 <-- 2 <-- 3 <-- 4 <-- 5
     * null <-- head <-- function(head.next)
     */
    // Runtime: 0 ms, faster than 100.00%
    // Memory Usage: 39.3 MB, less than 20.89% 

    ListNode ret;
    
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }else{
            helper(head);
        }
        
        return ret;
    }
    
    public ListNode helper(ListNode head) {
        
        if(head.next == null){
            ret = head;
            return head;
        }
        
        ListNode next = helper(head.next);
        next.next = head;
        head.next = null;
        
        return head;
    }
}