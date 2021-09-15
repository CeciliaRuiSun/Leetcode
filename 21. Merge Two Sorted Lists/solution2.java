// Runtime: 0 ms, faster than 100.00%
// Memory Usage: 38.4 MB, less than 68.02%

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        
        ListNode ret = new ListNode();
        ListNode result = ret;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ret.val = l1.val;
                l1 = l1.next;
                //System.out.println("l1: " + ret.val);
            } else{
                ret.val = l2.val;
                l2 = l2.next;
                //System.out.println("l2: " + ret.val);
            }
           
            if(l1 != null || l2 != null){
                ret.next = new ListNode();
                ret = ret.next;
            }
        }
        
        if(l2 != null){
            while(l2 != null){
                ret.val = l2.val;
                l2 = l2.next;
                if(l2 != null){
                    ret.next = new ListNode();
                    ret = ret.next;
                }
            }
        } 
        
        if(l1 != null){
            while(l1 != null){
                ret.val = l1.val;
                l1 = l1.next;
                if(l1 != null){
                    ret.next = new ListNode();
                    ret = ret.next;
                }
            }
        }
        
        return result;
    }
}
