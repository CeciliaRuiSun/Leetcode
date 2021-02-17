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
       ListNode ret = new ListNode();
       ListNode p = ret;
       
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
       while(l1 != null && l2 != null){
           System.out.println("l1 value: " + l1.val);
           System.out.println("l2 value: " + l2.val);
           
           if(l1.val <= l2.val){
               p.val = l1.val;
               l1 = l1.next;
           } else {
               p.val = l2.val;
               l2 = l2.next;
           }
           
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