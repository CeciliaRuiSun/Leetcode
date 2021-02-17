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
    //Created a new list
    //Runtime: 0 ms, faster than 100.00%
    //Memory Usage: 38.3 MB, less than 77.23% 

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode ret = new ListNode();
       ListNode p = ret;
       
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
       while(l1 != null && l2 != null){           
           if(l1.val <= l2.val){
               p.val = l1.val;
               l1 = l1.next;
           } else {
               p.val = l2.val;
               l2 = l2.next;
           }
           
           p.next = new ListNode();
           p = p.next;  
       }
        
       if(l1 == null && l2 != null){
           p.val = l2.val;
           p.next = l2.next;
       } else if (l1 != null && l2 == null){
           p.val = l1.val;
           p.next = l1.next;
       }
        
        return ret;
    }
}