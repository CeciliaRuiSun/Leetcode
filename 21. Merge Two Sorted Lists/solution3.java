// without creating a new list; adding one list to the other
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
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        
        while(cur1.next != null && cur2 != null){
            if(cur2.val <= cur1.next.val){
                l2 = cur2.next;
                cur2.next = cur1.next;
                cur1.next = cur2;
                cur1 = cur2;
                cur2 = l2; 
            } else{
                cur1 = cur1.next;
            }
        }
        
        if(cur1.next == null){
            cur1.next = cur2;
        }
        
        return l1;
    }
}
